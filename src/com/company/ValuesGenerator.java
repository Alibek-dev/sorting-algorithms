package com.company;

import java.util.ArrayList;

public class ValuesGenerator {

    public ArrayList<Integer> generationList(int n, int maxValue) {
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            values.add((int) (Math.random() * maxValue));
        }

        return values;
    }
}
