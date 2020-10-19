package stub;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface StubTables {

    List<Double> trigArgs = List.of(-Math.PI,
            -2.5,
            -2.1,
            -0.69 * Math.PI,
            -0.19 * Math.PI,
            -0.55,
            0.0);
    List<Double> logArgs = List.of(0.5,
            0.8,
            1.0,
            1.5,
            3.0,
            4.0,
            5.0,
            4.172,
            4.5,
            10.0);

    Map<Double, Double> sinTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::sin));
    Map<Double, Double> cosTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::cos));
    Map<Double, Double> tanTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::tan));
    Map<Double, Double> cotTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> 1 / Math.tan(arg)));
    Map<Double, Double> cscTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> 1 / Math.sin(arg)));

    Map<Double, Double> lnTable = logArgs.stream().collect(Collectors.toMap(arg -> arg, Math::log));
    Map<Double, Double> log3Table = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg) / Math.log(3)));
    Map<Double, Double> log5Table = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg) / Math.log(5)));
    Map<Double, Double> lgTable = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg) / Math.log(10)));
}
