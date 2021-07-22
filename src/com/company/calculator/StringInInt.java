package com.company.calculator;

public class StringInInt {
    static int[] strToInt (String[] values) throws UnknownStringFormatException {
        int num1 = Integer.parseInt(values[0]);
        int num2 = Integer.parseInt(values[2]);
        Check.check(num1);
        Check.check(num2);
        return new int[] {Integer.parseInt(values[0]) , Integer.parseInt(values[2])};
    }
}
