package com.test;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] sort = mergesort(new int[]{23,25,1,2,3,4,567,20,35,7,89,});
        System.out.println(sort);

        ArrayList<Integer> arraySort = new ArrayList<>();
        for (int i = 1; i <=10;i++){
            arraySort.add(i);
        }

        ArrayList<Integer> res = getEvenNumbers(arraySort);

        int min = getMin(res);
        int max = getMax(res);
        double averege = getAverege(res);

        System.out.println(min);
        System.out.println(max);
        System.out.println(averege);

    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> arrayList){
        ArrayList<Integer> temp = new ArrayList<>();

        for (Integer number : arrayList) {
            if(!(number%2 == 0))
                temp.add(number);
        }

        return temp;
    }

    public static int getMin(ArrayList<Integer> arrayList){
        Arrays.sort(arrayList.toArray());
        return arrayList.get(0);
    }

    public static int getMax(ArrayList<Integer> arrayList){
        Arrays.sort(arrayList.toArray());
        return arrayList.get(arrayList.size() - 1);
    }

    public static double getAverege(ArrayList<Integer> arrayList){
        return arrayList.stream().mapToInt(a -> a).average().orElse(0);
    }
}



