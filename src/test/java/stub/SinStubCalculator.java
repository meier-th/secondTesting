package stub;

import base.TestFunction;

public class SinStubCalculator implements TestFunction {

    private final static SinStubCalculator INSTANCE = new SinStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.sinTable.get(arg);
    }

    public static SinStubCalculator getInstance() {
        return INSTANCE;
    }

}
