package org.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<Integer>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addNumber(String name, Integer number) {
        if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
        }
        else {
            phoneBook.put(name, new ArrayList<>(number));
        }
    }

    public ArrayList<Integer> getNumbers (String name) {
        return phoneBook.get(name);
    }

}
