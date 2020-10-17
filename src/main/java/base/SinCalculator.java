package base;

import java.math.BigDecimal;

public class SinCalculator {

    private final static int ELEMS_NUM = 9;

    private long factorial;
    private int seriesElem;
    private int sign;

    public double sin(double arg) {
        factorial = 1;
        seriesElem = 0;
        sign = 1;
        double result = 0;
        for (int i = 0; i < ELEMS_NUM; ++i) {
            result += nextSeriesElem(arg);
        }
        return result;
    }

    private double nextSeriesElem(double arg) {
        double elem = sign * Math.pow(arg, 2*seriesElem+1) / factorial;
        seriesElem++;
        updateFactorial();
        sign *= -1;
        return elem;
    }

    private void updateFactorial() {
        factorial = factorial * (2*seriesElem+1)*(2*seriesElem);
    }

}
