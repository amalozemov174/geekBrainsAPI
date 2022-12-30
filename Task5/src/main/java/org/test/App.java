package org.test;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        String names = "" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        getCountName(names);

        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        HeapSort.printArray(arr);
    }

    public static void getCountName(String names){
        HashMap<String, Integer> counted = new HashMap<>();
        String tmp [] = names.split("\n");
        for (String name : tmp) {
            String nameTemp [] = name.split(" ");
            if (counted.containsKey(nameTemp[0])){
                counted.put(nameTemp[0],counted.get(nameTemp[0]).intValue() + 1);
            }
            else {
                counted.put(nameTemp[0], 1);
            }
        }




        System.out.println(counted);
    }

}
