package com.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
//В калькулятор добавьте возможность отменить последнюю операцию.
public class App {
    public static void main(String[] args) throws IOException {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        System.out.println(ll);
        System.out.println(reverseList(ll));

        myQueu myQueu = new myQueu();
        myQueu.enqueue("abc");
        myQueu.enqueue("bcd");
        myQueu.enqueue("cdf");
        System.out.println(myQueu.first());
        System.out.println(myQueu.dequeue());
        System.out.println(myQueu.first());

        getSimpleCalculator();
    }

    public static LinkedList<String> reverseList(LinkedList<String> list) {
        LinkedList<String> listReversal = new LinkedList<>();
        int tmp =  list.indexOf(list.getLast());
        for (int i = list.indexOf(list.getLast()); i >= 0; i--){
            for (int j = (list.size() - 1) - list.indexOf(list.getLast()); j <= list.indexOf(list.getLast()); j++){
                listReversal.addLast(list.get(i));
                break;
            }
        }
        return listReversal;
    }

    private static void getSimpleCalculator() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Калькулятор. Нажмитере Enter, чтобы продолжить, введите exit, чтобы закончить работу с калькулятором");
        int prevAmount = 0;
        int curAmount = 0;
        int init = 0;
        while (bufferedReader.readLine() != "exit") {
            if (init == 0) {
                System.out.println("Введите первое число");
                int first = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Введите торое число число");
                int second = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Выберите операцию");
                System.out.println("1 - Сложение");
                System.out.println("2 - Вычитание");
                System.out.println("3 - Умножение");
                System.out.println("4 - Деление");
                System.out.println("5 - Отменить последнюю операцию");
                int action = Integer.parseInt(bufferedReader.readLine());
                switch (action) {
                    case 1:
                        prevAmount = curAmount;
                        curAmount = first + second;
                        System.out.println("Результат: " + (first + second) );
                        break;
                    case 2:
                        prevAmount = curAmount;
                        curAmount = first - second;
                        System.out.println("Результат: " + (first - second) );
                        break;
                    case 3:
                        prevAmount = curAmount;
                        curAmount = first * second;
                        System.out.println("Результат: " + (first * second) );
                        break;
                    case 4:
                        prevAmount = curAmount;
                        curAmount = first / second;
                        System.out.println("Результат: " + (first / second) );
                        break;
                    case 5:
                        System.out.println("Результат: " + prevAmount);
                        curAmount = prevAmount;
                        break;
                }
                init++;
                System.out.println("Калькулятор. Нажмитере Enter, чтобы продолжить, введите exit, чтобы закончить работу с калькулятором");
            }
            else {
                System.out.println("Выберите операцию");
                System.out.println("1 - Сложение");
                System.out.println("2 - Вычитание");
                System.out.println("3 - Умножение");
                System.out.println("4 - Деление");
                System.out.println("5 - Отменить последнюю операцию");

                int action = Integer.parseInt(bufferedReader.readLine());
                int second;
                switch (action) {
                    case 1:
                        System.out.println("Введите второе число число");
                        second = Integer.parseInt(bufferedReader.readLine());
                        prevAmount = curAmount;
                        curAmount = prevAmount + second;
                        System.out.println("Результат: "  + curAmount);
                        break;
                    case 2:
                        System.out.println("Введите второе число число");
                        second = Integer.parseInt(bufferedReader.readLine());
                        prevAmount = curAmount;
                        curAmount = prevAmount - second;
                        System.out.println("Результат: " + curAmount);
                        break;
                    case 3:
                        System.out.println("Введите второе число число");
                        second = Integer.parseInt(bufferedReader.readLine());
                        prevAmount = curAmount;
                        curAmount = prevAmount * second;
                        System.out.println("Результат: " + curAmount);
                        break;
                    case 4:
                        System.out.println("Введите второе число число");
                        second = Integer.parseInt(bufferedReader.readLine());
                        prevAmount = curAmount;
                        curAmount = prevAmount / second;
                        System.out.println("Результат: "  + curAmount);
                        break;
                    case 5:
                        System.out.println("Результат: " + prevAmount);
                        curAmount = prevAmount;
                        break;
                }
                System.out.println("Калькулятор. Нажмитере Enter, чтобы продолжить, введите exit, чтобы закончить работу с калькулятором");
            }

        }
    }
}
