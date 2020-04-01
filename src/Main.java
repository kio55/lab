import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("[0] Exit \n" + "[1] data entry and calculation \n");
            int NumberMenu = InputСheck.number(scan);
            switch (NumberMenu) {
                case 0:
                    return;
                case 1:
                    Stack linkedStack;
                    System.out.println("Fill the list");
                    linkedStack = FillStack.fillStack(scan);
                    System.out.println(linkedStack.toString());

                    break;
                case 2:
                    String str = scan.next();
                    System.out.println(InputСheck.CheckOperation(str));
                    System.out.println(InputСheck.CheckOperation(str).contains(" gg") ? 1 : 2);

                default:
                    System.out.println("Enter again");
            }
        }
    }
}
