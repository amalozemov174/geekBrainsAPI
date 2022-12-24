package com.example;

import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class myQueu {
    private LinkedList<String> list;

    public myQueu(){
        list = new LinkedList<>();
    }

    public void enqueue(String s) {
        list.addLast(s);
    }

    public String dequeue() {
        String tmp = list.getFirst();
        list.removeFirst();
        return tmp;
    }

    public String first() {
        return list.getFirst();
    }

}
