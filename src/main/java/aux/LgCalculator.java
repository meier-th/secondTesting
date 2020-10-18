package aux;

import base.LnCalculator;
import base.TestFunction;

public class LgCalculator implements TestFunction {

    private static final LgCalculator INSTANCE = new LgCalculator();
    private TestFunction lnCalc;

    @Override
    public double fun(double arg) {
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
