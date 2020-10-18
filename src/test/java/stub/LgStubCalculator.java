package stub;

import aux.LgCalculator;
import base.TestFunction;

public class LgStubCalculator extends LgCalculator {

    private final static LgStubCalculator INSTANCE = new LgStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.lgTable.get(arg);
    }

    public static LgStubCalculator getInstance() {
        return INSTANCE;
    }

}
