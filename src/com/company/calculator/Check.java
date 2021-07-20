package com.company.calculator;

public class Check {
    static void check(int num) throws Exception {
        if (num > 10 || num < 1)
            throw new Exception("Введённая строка не подходит. Вводите от1 до 10 числа. Завершение работы.");
    }
}
