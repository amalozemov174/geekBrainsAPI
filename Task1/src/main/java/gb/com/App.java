package gb.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException{
        getTriangleNumber(4);
        getFactorial(3);
        getSimpleNumbers();
        getSimpleCalculator();

    }

    private static void getSimpleCalculator() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int first = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите торое число число");
        int second = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Выберите операцию");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        int action = Integer.parseInt(bufferedReader.readLine());
        switch (action) {
            case 1:
                System.out.println("Результат: " + (first + second) );
                break;
            case 2:
                System.out.println("Результат: " + (first - second) );
                break;
            case 3:
                System.out.println("Результат: " + (first * second) );
                break;
            case 4:
                System.out.println("Результат: " + (first / second) );
                break;
        }
    }

    public static void getTriangleNumber(int number) {
        int sum = 0;
        if (number == 1) {
            sum = 1;

        }
        else {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void getFactorial(int number) {
        int sum = 1;
        if (number == 1) {
            sum = 1;

        }
        else {
            for (int i = 1; i <= number; i++) {
                sum *= i;
            }
        }
        System.out.println(sum);
    }

    public static void getSimpleNumbers() {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = i > 2;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;}
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}


