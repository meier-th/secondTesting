package stub;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface StubTables {

    List<Double> trigArgs = List.of(0d, Math.PI/6, Math.PI/3, Math.PI/2, 2*Math.PI/3, 5*Math.PI/6, Math.PI, 7*Math.PI/6,
            4*Math.PI/3, 3*Math.PI/2, 5*Math.PI/3, 11*Math.PI/6, 2*Math.PI, -Math.PI/6, 13*Math.PI/6);
    List<Double> logArgs = List.of(Math.pow(Math.E, -5), Math.pow(Math.E, -1), Math.sqrt(Math.E), Math.E,
            Math.pow(Math.E, 2.5), Math.pow(Math.E, 4), Math.pow(Math.E, 10));

    Map<Double, Double> sinTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::sin));
    Map<Double, Double> cosTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::cos));
    Map<Double, Double> tanTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::tan));
    Map<Double, Double> cotTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::atan));
    Map<Double, Double> cscTable = trigArgs.stream().collect(Collectors.toMap(arg -> arg, Math::asin));

    Map<Double, Double> lnTable = logArgs.stream().collect(Collectors.toMap(arg -> arg, Math::log));
    Map<Double, Double> log3Table = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg)/Math.log(3)));
    Map<Double, Double> log5Table = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg)/Math.log(5)));
    Map<Double, Double> lgTable = logArgs.stream().collect(Collectors.toMap(arg -> arg, arg -> Math.log(arg)/Math.log(10)));
}
