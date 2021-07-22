package com.company.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownStringFormatException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] values = str.split(" ");

        if (values.length != 3) {
            throw new UnknownStringFormatException("Строка не подходит. Завершение работы");
        }
        boolean isRoman = isRoman(values);

        int[] numbers;
        if (isRoman) {
            numbers = new int[]{RomanArabicConvert.romanToArabic(values[0]), RomanArabicConvert.romanToArabic(values[2])};
        } else {
            numbers = StringInInt.strToInt(values);
        }
        int n1 = numbers[0], n2 = numbers[1];

        int result = switch (values[1]) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> throw new UnknownStringFormatException("Не правильный знак. Конец работе");
        };

        if (isRoman){
            System.out.println(RomanArabicConvert.arabicToRoman(result));
        } else
        System.out.println(result);
    }
    private static boolean isRoman(String[] values) {
        try {
            Integer.parseInt(values[0]);
            Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
