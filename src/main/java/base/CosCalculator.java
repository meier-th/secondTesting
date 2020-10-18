package base;

public class CosCalculator implements TestFunction {

    private static final CosCalculator INSTANCE = new CosCalculator();
    private TestFunction sinCalc;

    @Override
    public double fun(double arg) {
        if (sinCalc == null)
            sinCalc = SinCalculator.getInstance();
        final double sin = sinCalc.fun(arg);
        return Math.sqrt(1d - sin * sin);
    }

    public void setSinCalc(TestFunction sin) {
        this.sinCalc = sin;
    }

    public static CosCalculator getInstance() {
        return INSTANCE;
    }
}
