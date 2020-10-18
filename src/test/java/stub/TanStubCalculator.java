package stub;

import aux.TanCalculator;
import base.TestFunction;

public class TanStubCalculator extends TanCalculator {

    private final static TanStubCalculator INSTANCE = new TanStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.tanTable.get(arg);
    }

    public static TanStubCalculator getInstance() {
        return INSTANCE;
    }

}
