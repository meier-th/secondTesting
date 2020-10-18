package stub;

import base.TestFunction;

public class Log3StubCalculator implements TestFunction {

    private static final Log3StubCalculator INSTANCE = new Log3StubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.log3Table.get(arg);
    }

    public static Log3StubCalculator getInstance() {
        return INSTANCE;
    }

}
