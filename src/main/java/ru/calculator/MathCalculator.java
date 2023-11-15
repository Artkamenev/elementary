package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumsAllFromMathFunction(double first, double second) {
        return sum(first, second) + multiply(first, second)
               + difference(first, second) + division(first, second);//вопрос про отступ (сделал, как описано, но
                                                                    //идея ругается, точнее плагин идеи)
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumsAllFromMathFunction(10, 20));
    }
}