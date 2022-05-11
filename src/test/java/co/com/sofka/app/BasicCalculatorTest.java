package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing resta: 1-1=0")
    public void resta() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several restas")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "2,    1,   1",
            "100,  49, 51",
            "100,  1, 99"
    })
    public void severalRestas(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiplicacion: 1*1=1")
    public void multiplicacion() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multiplicación(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplicaciones")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "2,    1,   2",
            "10,  10, 100",
            "5,  4, 20"
    })
    public void severalMultiplicaciones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicación(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing división: 1/1=1")
    public void division() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisiones")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "2,    1,   2",
            "100,  10, 10",
            "80,  4, 20"
    })
    public void severalDivisiones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
