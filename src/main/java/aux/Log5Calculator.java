package aux;

import base.LnCalculator;
import base.TestFunction;

public class Log5Calculator implements TestFunction {

    private static final Log5Calculator INSTANCE = new Log5Calculator();
    private TestFunction lnCalc;

    @Override
    public double fun(double arg) {
        if (arg <= 0)
            throw new IllegalArgumentException("log5(x) arg cannot be negative or 0");
        if (lnCalc == null)
            lnCalc = LnCalculator.getInstance();
        return lnCalc.fun(arg)/lnCalc.fun(5);
    }

    public void setLnCalc(TestFunction ln) {
        this.lnCalc = ln;
    }

    public static Log5Calculator getInstance() {
        return INSTANCE;
    }

}
