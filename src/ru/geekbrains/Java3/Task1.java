package ru.geekbrains.Java3;

public class Task1 {
    public static void runTask1() {
        String[] strings = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"};
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        changePositions(strings, 0, 9);
        changePositions(nums, 5, 2);
        changePositions(strings, 9, 10);
    }

    private static <T> void changePositions(T[] array, int firstPos, int secondPos){
        T temp;
        if (firstPos < array.length && secondPos < array.length && firstPos >= 0 && secondPos >= 0){
            temp = array[firstPos];
            array[firstPos] = array[secondPos];
            array[secondPos] = temp;
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println(System.lineSeparator());
        } else {
            System.out.println("индекс за пределами массива");
        }
    }
}
