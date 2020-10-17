package base;

public class CosCalculator implements TestFunction {

    @Override
    public double fun(double arg) {
        final double sin = SinCalculator.getInstance().fun(arg);
        return Math.sqrt(1d - sin * sin);
    }
}
