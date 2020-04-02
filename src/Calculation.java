import java.util.HashMap;
import java.util.function.BinaryOperator;

public class Calculation {

    HashMap<String,BinaryOperator<Double>> operations =new HashMap<>();

    public Calculation() {
        operations.put("+",(x,y)->x+y);

        operations.put("-",(x,y)->x-y);

        operations.put("/",(x,y)->x/y);

        operations.put("*",(x,y)->x*y);

    }
    public double calculate(double x1 , double x2, String str){
        return operations.get(str).apply(x1,x2);
    }
}
