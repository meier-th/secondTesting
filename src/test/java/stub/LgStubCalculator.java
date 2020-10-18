package stub;

import base.TestFunction;

public class LgStubCalculator implements TestFunction {

    private final static LgStubCalculator INSTANCE = new LgStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.lgTable.get(arg);
    }

    public static LgStubCalculator getInstance() {
        return INSTANCE;
    }

}
