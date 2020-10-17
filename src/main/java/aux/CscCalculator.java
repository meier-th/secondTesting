package aux;

import base.SinCalculator;
import base.TestFunction;

public class CscCalculator implements TestFunction {
    private static final CscCalculator INSTANCE = new CscCalculator();

    @Override
    public double fun(double arg) {
        return 1 / SinCalculator.getInstance().fun(arg);
    }

    public static CscCalculator getInstance() {
        return INSTANCE;
    }
}
