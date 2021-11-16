package ru.geekbrains.Java3;

import java.util.ArrayList;

public class Task2 {
    public static <T> ArrayList<T> convertArrayToList(T[] array){
        ArrayList<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
