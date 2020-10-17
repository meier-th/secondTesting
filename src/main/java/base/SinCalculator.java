package base;

public class SinCalculator implements TestFunction {

    private final static int ELEMS_NUM = 20;

    private static final SinCalculator INSTANCE = new SinCalculator();

    @Override
    public double fun(double arg) {
        double result = 0;
        arg %= Math.PI*2;
        for (int i = 0; i < ELEMS_NUM; ++i)
            result += getSeriesElem(i, arg);
        return result;
    }

    public static SinCalculator getInstance() {
        return INSTANCE;
    }

    private double getSeriesElem(int num, double arg) {
        return Math.pow(-1, num) * Math.pow(arg, 2*num+1) / factorial(2*num+1);
    }

    private long factorial(int n) {
        if (n < 2)
            return 1;
        else {
            long result = 1;
            int i = 2;
            while (i <= n)
                result *= i++;
            return result;
        }
    }
}
