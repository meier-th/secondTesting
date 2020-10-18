package aux;

import base.SinCalculator;
import base.TestFunction;

public class CscCalculator implements TestFunction {
    private static final CscCalculator INSTANCE = new CscCalculator();
    private TestFunction sinCalc;

    @Override
    public double fun(double arg) {
        if (sinCalc == null)
            sinCalc = SinCalculator.getInstance();
        return 1 / sinCalc.fun(arg);
    }

    public void setSinCalc(TestFunction sin) {
        this.sinCalc = sin;
    }

    public static CscCalculator getInstance() {
        return INSTANCE;
    }
}
