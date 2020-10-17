package base;

import java.math.BigDecimal;

public class SinCalculator {

    private BigDecimal factorial;
    private int seriesElem;

    public double sin(double arg) {
        factorial = BigDecimal.ONE;
        seriesElem = 0;
        double result = 0;
        for (int i = 0; i < 100; ++i) {
            result += nextSeriesElem(arg);
        }
        return result;
    }

    private double nextSeriesElem(double arg) {
        double elem = BigDecimal.valueOf(Math.pow(arg, 2*seriesElem+1)).divide(factorial).doubleValue();
        seriesElem++;
        updateFactorial();
        return elem;
    }

    private void updateFactorial() {
        factorial = factorial.multiply(factorial.add(BigDecimal.ONE)).multiply(factorial.add(BigDecimal.valueOf(2)));
    }

}
