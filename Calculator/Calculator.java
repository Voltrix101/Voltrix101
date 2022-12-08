import java.util.Scanner;

public class Calculator {

    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------BASIC CALCULATOR--------------");
        double n1, n2, res = 0, n, fres = 0;
        char flag;
        flag = 'n';
        System.out.println("Enter first no");
        n1 = sc.nextDouble();
        n = n1;

        while (true) {

            System.out.println("Enter your operator('+','-,'*','/')");
            char op = sc.next().charAt(0);

            System.out.println("Enter a number");
            n2 = sc.nextDouble();
            res = 0;
            switch (op) {
                case '+':
                    System.out.println("Adding..");
                    res = n + n2;
                    break;
                case '-':
                    System.out.println("Subtracting..");
                    res = n - n2;
                    break;
                case '*':
                    System.out.println("Multiplying..");
                    res = n * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("Division not possible:Enter new number");
                        n2 = sc.nextDouble();
                    }
                    System.out.println("Dividing..");
                    res = n / n2;
                    break;
                default:
                    System.out.println("Wrong choice!Enter again");

            }
            System.out.println(res);
            System.out.println("Do you wish to continue('y'/'no')");
            flag = sc.next().charAt(0);
            if (flag == 'y') {
                n = res;
                continue;
            } else {
                fres = res;
                break;
            }

        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Final Result is" + fres);
        System.out.println("Thanks for using my program!");
        System.exit(0);
    }
}
