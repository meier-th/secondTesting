package aux;

import base.CosCalculator;
import base.SinCalculator;
import base.TestFunction;

public class TanCalculator implements TestFunction {
    private static final TanCalculator INSTANCE = new TanCalculator();

    @Override
    public double fun(double arg) {
        return SinCalculator.getInstance().fun(arg) / CosCalculator.getInstance().fun(arg);
    }

    public static TanCalculator getInstance() {
        return INSTANCE;
    }
}
