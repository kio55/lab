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
    public double calculate(String str , double x1 , double x2){
        return operations.get(str).apply(x1,x2);
    }
}
