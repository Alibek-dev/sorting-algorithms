package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ValuesGenerator generator = new ValuesGenerator();

        ArrayList<Integer> values = generator.generationList(1000, 2000);
        System.out.println("Сгенерированный массив: " + values);

        Date startDate = new Date();
        System.out.println("Сортировка пузырьком: " + new Sort().bubbleSort(values));
        long duration = startDate.getTime() - new Date().getTime();
        System.out.println("Промежуток мс: " + duration + "\n");

        startDate = new Date();
        System.out.println("Быстрая сортировка: " + new Sort().quickSort(values, 0, values.size() - 1));
        duration = startDate.getTime() - new Date().getTime();
        System.out.println("Промежуток мс: " + duration + "\n");

        startDate = new Date();
        Collections.sort(values);
        duration = startDate.getTime() - new Date().getTime();
        System.out.println("Встроенная сортировка" + values);
        System.out.println("Промежуток мс: " + duration + "\n");
    }
}
