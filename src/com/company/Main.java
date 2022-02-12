package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ValuesGenerator generator = new ValuesGenerator();

        ArrayList<Integer> values = generator.generationList(10);
        System.out.println("Сгенерированный массив: " + values);
        System.out.println("Сортировка пузырьком: " + new Sort().BubbleSort(values));
        System.out.println("Быстрая сортировка: " + new Sort().quickSort(values, 0, values.size() - 1));
    }
}
