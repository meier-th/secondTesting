package stub;

import base.CosCalculator;

public class CosStubCalculator extends CosCalculator {

    private final static CosStubCalculator INSTANCE = new CosStubCalculator();

    @Override
    public double fun(double arg) {
        return StubTables.cosTable.get(arg);
    }

    public static CosStubCalculator getInstance() {
        return INSTANCE;
    }

}
