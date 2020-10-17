package aux;

import base.LnCalculator;
import base.TestFunction;

public class LgCalculator implements TestFunction {

    private static final LgCalculator INSTANCE = new LgCalculator();

    @Override
    public double fun(double arg) {
        LnCalculator calc = LnCalculator.getInstance();
        return calc.fun(arg)/calc.fun(10);
    }

    public static LgCalculator getInstance() {
        return INSTANCE;
    }
}
