package base;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LogCalculator implements TestFunction {
    private final int base;

    public LogCalculator(int base) {
        this.base = base;
    }

    @Override
    public double fun(double arg) {
        throw new NotImplementedException();
    }
}
