import aux.*;
import base.LnCalculator;
import base.SinCalculator;
import base.TestFunction;

public class Main {

    public static void main(String[] args) {
        /*printTrigFuncs(SinCalculator.getInstance());
        printTrigFuncs(CosCalculator.getInstance());
        printTrigFuncs(TanCalculator.getInstance());
        printTrigFuncs(CotCalculator.getInstance());
        printTrigFuncs(CscCalculator.getInstance());
        System.out.println("KEKEKEKEKEKEKKEKEKEKE");*/

        //printLogFuncs(Log3Calculator.getInstance());
        //printLogFuncs(Log5Calculator.getInstance());
        printLogFuncs(LgCalculator.getInstance());
        //printLogFuncs(LnCalculator.getInstance());

    }

    private static void printTrigFuncs(TestFunction function) {
        System.out.println(function.fun(0));
        System.out.println(function.fun(Math.PI/2));
        System.out.println(function.fun(Math.PI/4));
        System.out.println(function.fun(Math.PI/6));
        System.out.println(function.fun(Math.PI/3));
    }

    private static void printLogFuncs(TestFunction function) {
        /*System.out.println(function.fun(Math.E));
        System.out.println(function.fun(Math.E*Math.E));
        System.out.println(function.fun(1/Math.E));
        System.out.println(function.fun(3));
        System.out.println(function.fun(9));*/
        /*System.out.println(function.fun(5));
        System.out.println(function.fun(0.2));
        System.out.println(function.fun(125));*/
        System.out.println(function.fun(10));
        System.out.println(function.fun(0.1));

    }

}
