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
                    GetResult result = new GetResult();
                    Stack news = result.Clone(linkedStack);
                    GetResult test = new GetResult();
                    Stack testt = test.calc(news);
                    while (testt.size() != 1){
                        news = result.Clone(testt);
                        testt = test.calc(news);
                    }
                    System.out.println(testt.toString());

                    break;
                case 2:



                default:
                    System.out.println("Enter again");
            }
        }
    }
}
