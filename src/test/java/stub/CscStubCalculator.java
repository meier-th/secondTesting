package stub;

import base.TestFunction;

public class CscStubCalculator implements TestFunction {

    private final static CscStubCalculator INSTANCE = new CscStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cscTable.get(arg);
    }

    public static CscStubCalculator getInstance() {
        return INSTANCE;
    }

}
