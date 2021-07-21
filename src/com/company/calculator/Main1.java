package com.company.calculator;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] values = str.split(" ");

        if (values.length != 3) {
            throw new Exception("Строка не подходит. Завершение работы");
        }

        int[] numbers = StringInInt.strToInt(values);
        int n1 = numbers[0], n2 = numbers[1];

        int result = switch (values[1]) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> throw new Exception("Не правильный знак. Конец работе");
        };
        System.out.println(result);
    }
}
