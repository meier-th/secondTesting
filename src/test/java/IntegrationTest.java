import aux.*;
import impl.WholeExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import stub.*;

import java.util.stream.Stream;

public class IntegrationTest {

    @ParameterizedTest()
    @MethodSource("getTestValues")
    // everything mocked
    public void testUpperModule(double arg, double expected, double delta) {
        final WholeExpression wholeExpression = new WholeExpression(new Log3StubCalculator(), new Log5StubCalculator(), new LgStubCalculator(),
                new TanStubCalculator(), new CotStubCalculator(), new CscStubCalculator());
        Assertions.assertEquals(expected, wholeExpression.compute(arg), delta);
    }

    @ParameterizedTest()
    @MethodSource("getTestValues")
    // only sin, cos and ln mocked
    public void testUpperAndFuncModules(double arg, double expected, double delta) {
        final WholeExpression wholeExpression = new WholeExpression(new Log3Calculator(new LnStubCalculator()), new Log5Calculator(new LnStubCalculator()), new LgCalculator(new LnStubCalculator()),
                new TanCalculator(new SinStubCalculator(), new CosStubCalculator()), new CotCalculator(), new CscCalculator(new SinStubCalculator()));
        Assertions.assertEquals(expected, wholeExpression.compute(arg), delta);
    }

    @ParameterizedTest()
    @MethodSource("getTestValues")
    // only sin, cos and ln mocked
    public void testAllModules(double arg, double expected, double delta) {
        final WholeExpression wholeExpression = new WholeExpression(new Log3Calculator(), new Log5Calculator(), new LgCalculator(),
                new TanCalculator(), new CotCalculator(), new CscCalculator());
        Assertions.assertEquals(expected, wholeExpression.compute(arg), delta);
    }

    public static Stream<Arguments> getTestValues() {
        return Stream.of(
                Arguments.of(-Math.PI, Double.NaN, 0.0),
                Arguments.of(-2.5, -3927.1, 1),
                Arguments.of(-2.1, -0.001075, 0.000001),
                Arguments.of(-0.69 * Math.PI, -0.0184, 0.0001),
                Arguments.of(-0.19 * Math.PI, 0.0067, 0.0001),
                Arguments.of(-0.55, 0, 1.0),
                Arguments.of(0, Double.NaN, 0.0),
                Arguments.of(0.5, 165.1, 1.0),
                Arguments.of(0.8, 259910.1, 1.0),
                Arguments.of(1, Double.NaN, 0.0),
                Arguments.of(1.5, 6311.7, 1.0),
                Arguments.of(4, 0.018, 0.001),
                Arguments.of(4.172, 0.064, 0.001),
                Arguments.of(4.5, 0.182, 0.001),
                Arguments.of(10, 0.846, 0.001)
        );
    }

}
