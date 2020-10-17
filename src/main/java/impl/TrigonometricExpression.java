package impl;

import aux.CotCalculator;
import aux.CscCalculator;
import aux.TanCalculator;

public final class TrigonometricExpression {
    public static double compute(double x) {
        final double tan = TanCalculator.getInstance().fun(x);
        final double cot = CotCalculator.getInstance().fun(x);
        final double csc = CscCalculator.getInstance().fun(x);
        final double sqrCot = cot * cot;
        final double expr1 = Math.pow((sqrCot + cot) / (tan * csc), 3);
        return Math.pow(expr1, 3);
    }
}
