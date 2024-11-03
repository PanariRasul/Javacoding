
import java.util.*;

class Calculator {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Choose Operater: +, -, *, /");
        char operater = sc.next().charAt(0);

        int result = 0;

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
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    sc.close();
                }
                break;
            default:
                System.out.println("Enter Valid Number");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
;
};
