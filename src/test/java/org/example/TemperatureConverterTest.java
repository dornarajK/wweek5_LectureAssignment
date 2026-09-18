package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testFahrenheitToCelsius() {
        Assertions.assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        Assertions.assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        Assertions.assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        Assertions.assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        Assertions.assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        Assertions.assertFalse(converter.isExtremeTemperature(-40));
        Assertions.assertFalse(converter.isExtremeTemperature(50));

        Assertions.assertTrue(converter.isExtremeTemperature(-41));
        Assertions.assertTrue(converter.isExtremeTemperature(51));
    }
}