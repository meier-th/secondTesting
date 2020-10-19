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
            return new WholeExpression.TrigonometricExpression().compute(arg);
        return new WholeExpression.LogarithmicExpression().compute(arg);
    }

    private class LogarithmicExpression {

        public double compute(double arg) {
            final double log3 = log3Calculator.fun(arg);
            final double log5 = log5Calculator.fun(arg);
            final double lg = lgCalculator.fun(arg);
            return Math.pow((Math.pow(log5, 3) - lg)/(Math.pow(lg, 3)*log3), 2);
        }

    }

    private final class TrigonometricExpression {
        public double compute(double x) {
            final double tan = tanCalculator.fun(x);
            final double cot = cotCalculator.fun(x);
            final double csc = cscCalculator.fun(x);
            final double sqrCot = cot * cot;
            final double expr1 = Math.pow((sqrCot + cot) / (tan * csc), 3);
            return Math.pow(expr1, 3);
        }
    }
}
