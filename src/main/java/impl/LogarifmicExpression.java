package impl;

import aux.LgCalculator;
import aux.Log3Calculator;
import aux.Log5Calculator;

public class LogarifmicExpression {

    public static double compute(double arg) {
        final double log3 = Log3Calculator.getInstance().fun(arg);
        final double log5 = Log5Calculator.getInstance().fun(arg);
        final double lg = LgCalculator.getInstance().fun(arg);
        return Math.pow((Math.pow(log5, 3) - lg)/(Math.pow(lg, 3)*log3), 2);
    }

}
