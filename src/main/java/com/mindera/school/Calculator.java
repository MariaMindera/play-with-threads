package com.mindera.school;

public class Calculator {
    private int max;

    public Calculator(int max) {
        this.max = max;
    }

    public String getResult() {
        StringBuilder resultBuilder = new StringBuilder();

        int x = 0, y = 1, z;

        for (int i = 0; i < max; i++) {
            resultBuilder.append(x);
            resultBuilder.append(",");

            z = y + x;
            x = y;
            y = z;
        }

        resultBuilder.deleteCharAt(max * 2 - 1);

        return String.valueOf(resultBuilder);
    }
}
