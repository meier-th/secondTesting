package stub;

import aux.CscCalculator;
import base.TestFunction;

public class CscStubCalculator extends CscCalculator {

    private final static CscStubCalculator INSTANCE = new CscStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cscTable.get(arg);
    }

    public static CscStubCalculator getInstance() {
        return INSTANCE;
    }

}
