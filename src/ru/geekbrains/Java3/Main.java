package ru.geekbrains.Java3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Task1.runTask1();

        String[] array = {"a", "b", "C"};
        ArrayList<Object> list = new ArrayList<>(Task2.convertArrayToList(array));
        System.out.println("полученный ArrayList: " + list.toString());

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        ArrayList<Apple> apples1= new ArrayList<>();
        ArrayList<Apple> apples2= new ArrayList<>();
        ArrayList<Orange> oranges1= new ArrayList<>();

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        box1.addToBox(apple1);
        box1.addToBox(apple2);
        box1.addToBox(apple2);
        box3.addToBox(orange1);
        box3.addToBox(orange2);

        System.out.println("Вес box1 = " + box1.getWeight());
        System.out.println("Вес box3 = " + box3.getWeight());
        System.out.println("Вес box1 = вес box3? " + box1.compare(box3));

        box2.addToBox(apple4);
        box2.addToBox(apple3);
        System.out.println("Вес box2 = " + box2.getWeight());
        box1.transfer(box2);
        System.out.println("Вес box2 после пересыпания= " + box2.getWeight());
        System.out.println("Вес box1 после пересыпания= " + box1.getWeight());
    }
}
