package aux;

import base.LnCalculator;
import base.TestFunction;

public class Log3Calculator implements TestFunction {

    private static final Log3Calculator INSTANCE = new Log3Calculator();
    private TestFunction lnCalc;

    @Override
    public double fun(double arg) {
        if (lnCalc == null)
            lnCalc = LnCalculator.getInstance();
        return lnCalc.fun(arg)/lnCalc.fun(3);
    }

    public void setLnCalc(TestFunction ln) {
        this.lnCalc = ln;
    }

    public static Log3Calculator getInstance() {
        return INSTANCE;
    }

}
