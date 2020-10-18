package stub;

import aux.Log5Calculator;
import base.TestFunction;

public class Log5StubCalculator extends Log5Calculator {

    private final static Log5StubCalculator INSTANCE = new Log5StubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.log5Table.get(arg);
    }

    public static Log5StubCalculator getInstance() {
        return INSTANCE;
    }

}
