package stub;

import base.TestFunction;

public class Log5StubCalculator implements TestFunction {

    private final static Log5StubCalculator INSTANCE = new Log5StubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.log5Table.get(arg);
    }

    public static Log5StubCalculator getInstance() {
        return INSTANCE;
    }

}
