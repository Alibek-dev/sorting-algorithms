package com.company;

import java.util.ArrayList;

public class Sort {
    public ArrayList<Integer> BubbleSort(ArrayList<Integer> values) {
        int temp;
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size() - 1; j++) {
                if (values.get(j) > values.get(j + 1)) {
                    temp = values.get(j);
                    values.set(j, values.get(j + 1));
                    values.set(j + 1, temp);
                }
            }
        }
        return values;
    }

    private int partition(ArrayList<Integer> values, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (values.get(i) < values.get(pivot)) {
                int temp = values.get(counter);
                values.set(counter, values.get(i));
                values.set(i, temp);
                counter++;
            }
        }
        int temp = values.get(pivot);
        values.set(pivot, values.get(counter));
        values.set(counter, temp);

        return counter;
    }

    public ArrayList<Integer> quickSort(ArrayList<Integer> values, int begin, int end) {
        if (end <= begin) return null;
        int pivot = partition(values, begin, end);
        quickSort(values, begin, pivot-1);
        quickSort(values, pivot+1, end);

        return values;
    }
}
