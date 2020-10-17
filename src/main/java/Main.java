import base.CosCalculator;
import base.LogCalculator;
import base.SinCalculator;
import base.TestFunction;

public class Main {

    public static void main(String[] args) {
        printFuncs(SinCalculator.getInstance());
        printFuncs(CosCalculator.getInstance());
//        printFuncs(new LogCalculator(5));
    }

    private static void printFuncs(TestFunction function) {
        System.out.println(function.fun(0));
        System.out.println(function.fun(Math.PI/2));
        System.out.println(function.fun(Math.PI/4));
        System.out.println(function.fun(Math.PI/6));
        System.out.println(function.fun(Math.PI/3));
    }

}
