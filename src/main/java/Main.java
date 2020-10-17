import base.SinCalculator;

public class Main {

    public static void main(String[] args) {
        SinCalculator calc = new SinCalculator();
        System.out.println(calc.fun(0));
        System.out.println(calc.fun(Math.PI/2));
        System.out.println(calc.fun(Math.PI/4));
        System.out.println(calc.fun(Math.PI/6));
        System.out.println(calc.fun(Math.PI/3));
    }

}
