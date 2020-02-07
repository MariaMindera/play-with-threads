package com.mindera.school;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private int max;

    public Calculator(int max) {
        this.max = max;
    }

    public String getResult() {
        List<String> list = new ArrayList<>();

        int x = 0, y = 1, z;

        for (int i = 0; i < max; i++) {
            list.add(String.valueOf(x));
            z = y + x;
            x = y;
            y = z;
        }
        return String.join(",", list);
    }
}

