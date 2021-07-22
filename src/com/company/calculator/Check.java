package com.company.calculator;

public class Check {
    static void check(int num) throws UnknownStringFormatException {
        if (num > 10 || num < 1)
            throw new UnknownStringFormatException("Введённая строка не подходит. Вводите от1 до 10 числа. Завершение работы.");
    }
}
