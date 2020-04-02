import java.util.Scanner;

public class FillStack {
    private static final String message = "Enter data: ";
    private static final String messageError = "Enter again: ";

    public static Stack fillStack(final Scanner scan) {
        Stack linkedStack = new Stack();
        while (true) {
            System.out.print(message);
            String str = scan.next();
            while (!(InputСheck.isNumber(str) || !InputСheck.CheckOperation(str).contains(" gg"))) {
                if (str.equalsIgnoreCase("end")) return linkedStack;
                System.out.print(messageError);
                str = scan.next();
            }
            linkedStack.push(str);
        }
    }

    public static Stack fillStackLine(final Scanner scan) {
        Stack linkedStack = new Stack();
        String[] line = scan.next("\n").split(" ");
        for (String s : line) {
            if (InputСheck.isNumber(s) || InputСheck.CheckOperation(s).contains(" gg")) return null;
            linkedStack.push(s);
        }
        return linkedStack;

    }
}
