import java.awt.geom.Point2D;
import java.util.Scanner;

public class GetResult {

    private String formula;
    private static Calculation calculation = new Calculation();

    public Stack Clone(Stack st) {
        int n = st.size();
        Stack reversed = new Stack();
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (st.peek().equals("(") || st.peek().equals(")")) {
                for (int j = i; j < st.size() + 1; j++) {
                    formula += st.pop();
                }
                return null;
            } else {
                if (st.peek().equals("+") || st.peek().equals("-") || st.peek().equals("*") || st.peek().equals("/")) {
                    count++;
                    reversed.push(st.pop());
                } else {
                    reversed.push(st.pop());
                }
            }
        }
        return (count == n - count - 1) ? reversed : null;
    }

    /* public static String calculate(){
         Scanner scan = new Scanner(System.in);
         Stack linkedStack;
         System.out.println("Fill the list");
         linkedStack = FillStack.fillStack(scan);
         System.out.println(linkedStack.toString());
         GetResult result = new GetResult();
         Stack news = result.Clone(linkedStack);
         if (news == null){
             return "This is not a postfix form of notation.";
         } else {
             Calculation calc = new Calculation();
             int count = 0;
             while (news.size() != 0){

             }
         }


     }
 */
    public Stack calc(Stack firstStack) {
        int count = 0;
        int size = firstStack.size();
        Stack sStack = new Stack();

        while (InputСheck.CheckOperation(firstStack.peek()).contains(" gg")) {
            count++;
            sStack.push(firstStack.pop());
        }
        for (int i=1 ;i < size - count + 1; i++ ){
            sStack.push(firstStack.pop());
        }
        Stack ssStack = Clone(sStack);


        if (count < 2) {
            return null;
        }
        Stack secondStack = new Stack();
        if (count == 2) {

            secondStack.push(calculation.calculate(Double.parseDouble(ssStack.pop()), Double.parseDouble(ssStack.pop()), ssStack.pop()) + "");
            for (int i = 1; i < size - 2; i++) {
                secondStack.push(ssStack.pop());
            }
            System.out.println(secondStack.toString());
            return secondStack;
        } else {
            int size1 = ssStack.size();
            for (int i = 1; i < count - 1; i++) {
                secondStack.push(ssStack.pop());
            }
            secondStack.push(calculation.calculate(Double.parseDouble(ssStack.pop()), Double.parseDouble(ssStack.pop()), ssStack.pop()) + "");
            for (int i = 1; i < size - 3; i++) {
                secondStack.push(ssStack.pop());
            }
            System.out.println(secondStack.toString());
            return secondStack;
        }



    }


}
