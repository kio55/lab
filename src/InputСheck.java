import java.util.Scanner;

public class InputСheck {
    public static int number(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Error, try again: ");
        }
        return scan.nextInt();
    }
    public static double isdouble(Scanner scan) {
        while (!scan.hasNextDouble() ) {
            scan.next();
            System.out.println("Error, try again: ");
        }
        return scan.nextDouble();
    }
    public static String CheckOperation(String scan){

        if (scan.equals("+") || scan.equals("*") || scan.equals("/") || scan.equals("-") || scan.equals("(") || scan.equals(")")){
            return scan;
        }
        return scan + " gg";
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

}
