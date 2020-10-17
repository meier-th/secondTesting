package aux;

import base.LnCalculator;
import base.TestFunction;

public class Log5Calculator implements TestFunction {

    private static final Log5Calculator INSTANCE = new Log5Calculator();

    @Override
    public double fun(double arg) {
        LnCalculator calc = LnCalculator.getInstance();
        return calc.fun(arg)/calc.fun(5);
    }

    public static Log5Calculator getInstance() {
        return INSTANCE;
    }

}
