package stub;

import base.TestFunction;

public class CosStubCalculator implements TestFunction {

    private final static CosStubCalculator INSTANCE = new CosStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cosTable.get(arg);
    }

    public static CosStubCalculator getInstance() {
        return INSTANCE;
    }

}
