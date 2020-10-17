package aux;

import base.LnCalculator;
import base.TestFunction;

public class Log3Calculator implements TestFunction {

    private static final Log3Calculator INSTANCE = new Log3Calculator();

    @Override
    public double fun(double arg) {
        LnCalculator calc = LnCalculator.getInstance();
        return calc.fun(arg)/calc.fun(3);
    }

    public static Log3Calculator getInstance() {
        return INSTANCE;
    }

}
