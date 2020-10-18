package stub;

import base.LnCalculator;
import base.TestFunction;

public class LnStubCalculator extends LnCalculator {

    private final static LnStubCalculator INSTANCE = new LnStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.lnTable.get(arg);
    }

    public static LnStubCalculator getInstance() {
        return INSTANCE;
    }

}
