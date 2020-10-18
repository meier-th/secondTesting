package stub;

import base.SinCalculator;
import base.TestFunction;

public class SinStubCalculator extends SinCalculator {

    private final static SinStubCalculator INSTANCE = new SinStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.sinTable.get(arg);
    }

    public static SinStubCalculator getInstance() {
        return INSTANCE;
    }

}
