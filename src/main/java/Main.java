import base.LnCalculator;
import base.SinCalculator;
import impl.WholeExpression;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        printToCsv("sin.csv", SinCalculator.getInstance()::fun, -Math.PI/6, 13*Math.PI/6, Math.PI/6);
        printToCsv("ln.csv", LnCalculator.getInstance()::fun, 0.1, Math.pow(Math.E, 3), 0.1);
    }

    private static double calc(double arg) {
        return new WholeExpression().compute(arg);
    }

    private static void printToCsv(String filename, Function<Double, Double> function, double argMin, double argMax, double argStep) {
        try {
            Path resultFile = Paths.get(filename);
            if (Files.exists(resultFile))
                Files.delete(resultFile);
            Files.createFile(resultFile);
            for (double x = argMin; x <= argMax; x += argStep)
                Files.write(resultFile, String.format("%f,%f,\n", x, function.apply(x)).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }

}
