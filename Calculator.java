import java.util.Scanner;

public class Calculator {

    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------BASIC CALCULATOR--------------");
        double n1, n2, res = 0, fres = 0;
        System.out.println("Enter first number:");
        n1 = sc.nextDouble();
        char flag = 'o';
        res = n1;

        while (true) {
            System.out.println("Enter a number");
            n2 = sc.nextDouble();

            System.out.println("Enter your operator('+','-,'*','/').Enter '#'' to exit.Enter '0' to start from 0");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Adding..");
                    res = res + n2;
                    break;
                case '-':
                    System.out.println("Subtracting..");
                    res = res - n2;
                    break;
                case '*':
                    System.out.println("Multiplying..");
                    res = res * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("Division not possible:Enter new number");
                        n2 = sc.nextDouble();
                    }
                    System.out.println("Dividing..");
                    res = res / n2;
                    break;
                case '0':
                    fres = 0;

                    System.out.println("Enter first number");
                    n1 = sc.nextInt();
                    res = n1;
                    break;
                case '#':
                    flag = 'n';
                    break;

                default:
                    System.out.println("Wrong choice!Enter again");

            }
            if (flag == 'n') {

                break;
            }
            System.out.println(res);
            fres = res;

            /*
             * System.out.println("Do you wish to continue('y'/'no')");
             * flag = sc.next().charAt(0);
             * if (flag == 'y') {
             * res=n;
             * continue;
             * } else {
             * ;
             * break;
             * }
             */

        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Final Result is" + fres);
        System.out.println("Thanks for using my program!");
        System.exit(0);
    }
}
