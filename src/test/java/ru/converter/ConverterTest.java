package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Dlr() {
        double in = 180;
        double expected = 2;
        double out = Converter.rubleToDollar(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen1Dot4Eur() {
        double in = 140;
        double expected = 1.4;
        double out = Converter.rubleToEuro(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert360RblThen4Dlr() {
        double in = 360;
        double expected = 4;
        double out = Converter.rubleToDollar(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert1400RblThen14Eur() {
        double in = 1400;
        double expected = 14;
        double out = Converter.rubleToEuro(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert90RblThen1Dlr() {
        double in = 90;
        double expected = 1;
        double out = Converter.rubleToDollar(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert14RblThen0Dot14Eur() {
        double in = 14;
        double expected = 0.14;
        double out = Converter.rubleToEuro(in);
        double eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}