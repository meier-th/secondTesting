package aux;

import base.CosCalculator;
import base.SinCalculator;
import base.TestFunction;

public class TanCalculator implements TestFunction {
    private static final TanCalculator INSTANCE = new TanCalculator();
    private TestFunction sinCalc;

    @Override
    public double fun(double arg) {
        if (sinCalc == null)
            sinCalc = SinCalculator.getInstance();
        return sinCalc.fun(arg) / CosCalculator.getInstance().fun(arg);
    }

    public void setSinCalc(TestFunction sin) {
        this.sinCalc = sin;
    }

    public static TanCalculator getInstance() {
        return INSTANCE;
    }
}
