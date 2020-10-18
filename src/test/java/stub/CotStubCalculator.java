package stub;

import base.TestFunction;

public class CotStubCalculator implements TestFunction {

    private final static CotStubCalculator INSTANCE = new CotStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cotTable.get(arg);
    }

    public static CotStubCalculator getInstance() {
        return INSTANCE;
    }

}
