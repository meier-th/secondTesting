package aux;

import base.LnCalculator;
import base.TestFunction;

public class LgCalculator implements TestFunction {

    private static final LgCalculator INSTANCE = new LgCalculator();
    private TestFunction lnCalc;

    public LgCalculator(TestFunction lnCalc) {
        this.lnCalc = lnCalc;
    }

    public LgCalculator() {
    }

    @Override
    public double fun(double arg) {
        if (arg <= 0)
            throw new IllegalArgumentException("lg(x) arg cannot be negative or 0");
        if (lnCalc == null)
            lnCalc = LnCalculator.getInstance();
        return lnCalc.fun(arg)/lnCalc.fun(10);
    }

    public void setLnCalc(TestFunction ln) {
        this.lnCalc = ln;
    }

    public static LgCalculator getInstance() {
        return INSTANCE;
    }
}
