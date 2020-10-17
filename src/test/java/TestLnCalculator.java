import base.LnCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLnCalculator {

    private static void runSinTestWithPrecision(double arg, double precision) {
        assertEquals(Math.log(arg), LnCalculator.getInstance().fun(arg), precision);
    }

    @Tag("low")
    @DisplayName("ln(x) test with low precision")
    @ParameterizedTest
    @MethodSource("getDataSet")
    public void testSinLowPrecision(double arg) {
        runSinTestWithPrecision(arg, 0.1);
    }

    @Tag("medium")
    @DisplayName("ln(x) test with medium precision")
    @ParameterizedTest
    @MethodSource("getDataSet")
    public void testSinMediumPrecision(double arg) {
        runSinTestWithPrecision(arg, 0.001);
    }

    @Tag("high")
    @DisplayName("ln(x) test with high precision")
    @ParameterizedTest
    @MethodSource("getDataSet")
    public void testSinHighPrecision(double arg) {
        runSinTestWithPrecision(arg, 0.0001);
    }

    public static Stream<Double> getDataSet() {
        return Stream.of(Math.pow(Math.E, -5), Math.pow(Math.E, -1), Math.pow(Math.E, 1), Math.E, Math.pow(Math.E, 4), Math.pow(Math.E, 10));
    }

}
