package aux;

import base.TestFunction;

public class CotCalculator implements TestFunction {
    private static final CotCalculator INSTANCE = new CotCalculator();

    @Override
    public double fun(double arg) {
        final double tan = TanCalculator.getInstance().fun(arg);
        return 1 / tan;
    }

    public static CotCalculator getInstance() {
        return INSTANCE;
    }
}
