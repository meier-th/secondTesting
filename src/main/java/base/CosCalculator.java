package base;

public class CosCalculator implements TestFunction {

    private static final CosCalculator INSTANCE = new CosCalculator();

    @Override
    public double fun(double arg) {
        final double sin = SinCalculator.getInstance().fun(arg);
        return Math.sqrt(1d - sin * sin);
    }

    public static CosCalculator getInstance() {
        return INSTANCE;
    }
}
