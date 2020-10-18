package stub;

import aux.CotCalculator;
import base.TestFunction;

public class CotStubCalculator extends CotCalculator {

    private final static CotStubCalculator INSTANCE = new CotStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cotTable.get(arg);
    }

    public static CotStubCalculator getInstance() {
        return INSTANCE;
    }

}
