import base.SinCalculator;

public class Main {

    public static void main(String[] args) {
        SinCalculator calc = new SinCalculator();
        System.out.println(calc.sin(0));
        System.out.println(calc.sin(Math.PI/2));
        System.out.println(calc.sin(Math.PI));
        System.out.println(calc.sin(15*Math.PI));
    }

}
