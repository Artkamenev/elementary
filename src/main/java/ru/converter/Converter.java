package ru.converter;

public class Converter {
    public static double rubleToDollar(double value) {
        return value / 90;
    }
    public static double rubleToEuro(double value) {
        return value / 100;
    }

    public static void main(String[] args) {
        double inRubForDollar = 180;
        double expRubForDollar = 2;
        double outRubForDollar= rubleToDollar(inRubForDollar);
        double inRubForEuro = 140;
        double expRubForEuro = 1.4;
        double outRubForEuro = rubleToEuro(inRubForEuro);
        boolean passedRubForDollar = expRubForDollar == outRubForDollar;
        boolean passedRubForEuro = expRubForEuro == outRubForEuro;
        System.out.println("180 rubles are 2. Test result : " + passedRubForDollar);
        System.out.println("140 rubles are 1.4. Test result : " + passedRubForEuro);
    }
}