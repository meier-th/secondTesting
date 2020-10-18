package impl;

import aux.*;

public class WholeExpression {

    private final Log3Calculator log3Calculator;
    private final Log5Calculator log5Calculator;
    private final LgCalculator lgCalculator;
    private final TanCalculator tanCalculator;
    private final CotCalculator cotCalculator;
    private final CscCalculator cscCalculator;

    public WholeExpression(Log3Calculator log3Calculator, Log5Calculator log5Calculator, LgCalculator lgCalculator,
                           TanCalculator tanCalculator, CotCalculator cotCalculator, CscCalculator cscCalculator) {
        this.log3Calculator = log3Calculator;
        this.log5Calculator = log5Calculator;
        this.lgCalculator = lgCalculator;
        this.tanCalculator = tanCalculator;
        this.cotCalculator = cotCalculator;
        this.cscCalculator = cscCalculator;
    }

    public WholeExpression() {
        log3Calculator = Log3Calculator.getInstance();
        log5Calculator = Log5Calculator.getInstance();
        lgCalculator = LgCalculator.getInstance();
        tanCalculator = TanCalculator.getInstance();
        cotCalculator = CotCalculator.getInstance();
        cscCalculator = CscCalculator.getInstance();
    }

    public double compute(double arg) {
        if (arg <= 0)
            return WholeExpression.TrigonometricExpression.compute(arg);
        return WholeExpression.LogarithmicExpression.compute(arg);
    }

    private static class LogarithmicExpression {

        public static double compute(double arg) {
            final double log3 = Log3Calculator.getInstance().fun(arg);
            final double log5 = Log5Calculator.getInstance().fun(arg);
            final double lg = LgCalculator.getInstance().fun(arg);
            return Math.pow((Math.pow(log5, 3) - lg)/(Math.pow(lg, 3)*log3), 2);
        }

    }

    private static final class TrigonometricExpression {
        public static double compute(double x) {
            final double tan = TanCalculator.getInstance().fun(x);
            final double cot = CotCalculator.getInstance().fun(x);
            final double csc = CscCalculator.getInstance().fun(x);
            final double sqrCot = cot * cot;
            final double expr1 = Math.pow((sqrCot + cot) / (tan * csc), 3);
            return Math.pow(expr1, 3);
        }
    }
}
