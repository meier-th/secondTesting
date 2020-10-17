import base.TestFunction;
import impl.LogarifmicExpression;
import impl.TrigonometricExpression;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(0));
        System.out.println(calc(15));
        System.out.println(calc(-5));
    }

    private static double calc(double arg) {
        if (arg <= 0)
            return TrigonometricExpression.compute(arg);
        return LogarifmicExpression.compute(arg);
    }

    private static void printTrigFuncs(TestFunction function) {
        System.out.println(function.fun(0));
        System.out.println(function.fun(Math.PI/2));
        System.out.println(function.fun(Math.PI/4));
        System.out.println(function.fun(Math.PI/6));
        System.out.println(function.fun(Math.PI/3));
    }

    private static void printLogFuncs(TestFunction function) {
        System.out.println(function.fun(Math.E));
        System.out.println(function.fun(Math.E*Math.E));
        System.out.println(function.fun(1/Math.E));
        System.out.println(function.fun(3));
        System.out.println(function.fun(9));
        System.out.println(function.fun(5));
        System.out.println(function.fun(0.2));
        System.out.println(function.fun(125));
        System.out.println(function.fun(10));
        System.out.println(function.fun(0.1));

    }

}
