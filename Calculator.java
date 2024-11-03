
import java.util.*;

class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose Operater (+, -, *, /)");
        char operater = sc.next().charAt(0);

        double result = 0;

        switch (operater) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    break;
                } else {
                    System.out.println("Infinite");
                }

            default:
                System.out.println("Invalid Entery!");
                sc.close();
        }

        System.out.println("Result: " + result);
        sc.close();
    }
;
};
