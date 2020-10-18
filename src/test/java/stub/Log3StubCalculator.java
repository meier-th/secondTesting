package stub;

import aux.Log3Calculator;
import base.TestFunction;

public class Log3StubCalculator extends Log3Calculator {

    private static final Log3StubCalculator INSTANCE = new Log3StubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.log3Table.get(arg);
    }

    public static Log3StubCalculator getInstance() {
        return INSTANCE;
    }

}
