package base;

public class LnCalculator implements TestFunction {

    private final static LnCalculator INSTANCE = new LnCalculator();

    @Override
    public double fun(double arg) {
        int elemNum;
        if (arg < 1000)
            elemNum = 1000;
        else if (arg < 1000000)
            elemNum = 30000;
        else
            elemNum = 100000000;
        double result = 0;
        for (int i = 1; i < elemNum; ++i)
            result += seriesElement(i, arg);
        return 2*result;
    }

    public static LnCalculator getInstance() {
        return INSTANCE;
    }

    private double seriesElement(int num, double arg) {
        return Math.pow((arg-1)/(arg+1), 2*num-1)/(2*num - 1);
    }

}
