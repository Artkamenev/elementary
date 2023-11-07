package ru.converter;

public class Converter {
    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static void main(String[] args) {
        int rubForDollar = 140;
        int rubForEuro = 140;
        float dollar = rubleToDollar(rubForDollar);
        System.out.println(rubForDollar + " rubles are " + dollar + " dollar.");
        float euro = rubleToEuro(rubForEuro);
        System.out.println(rubForEuro + " rubles are " + euro + " euro.");
    }
}