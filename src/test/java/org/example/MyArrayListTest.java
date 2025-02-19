package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        // Тестирование MyArrayList
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        System.out.println("MyArrayList: " + myList);
        System.out.println("Size: " + myList.size());
        System.out.println("Contains 'Java': " + myList.contains("Java"));
        System.out.println("Element at index 1: " + myList.get(1));
        myList.remove("Python");
        System.out.println("After removing 'Python': " + myList);

        // Тестирование стандартного ArrayList
        List<String> stdList = new ArrayList<>();
        stdList.add("Java");
        stdList.add("Python");
        stdList.add("C++");

        System.out.println("Standard ArrayList: " + stdList);
        System.out.println("Size: " + stdList.size());
        System.out.println("Contains 'Java': " + stdList.contains("Java"));
        System.out.println("Element at index 1: " + stdList.get(1));
        stdList.remove("Python");
        System.out.println("After removing 'Python': " + stdList);
    }
}