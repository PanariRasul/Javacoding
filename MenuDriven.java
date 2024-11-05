
import java.util.Scanner;

public class MenuDriven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Enter 1 for enter your marks or enter 0 for stop");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter your Marks: ");
                int Marks = sc.nextInt();

                if (Marks >= 90 && Marks <= 100) {
                    System.out.println("This is Good Marks");
                } else if (89 >= Marks && Marks >= 60) {
                    System.out.println("This also Good Marks!");
                } else if (59 >= Marks && Marks >= 0) {
                    System.out.println("This Marks Also Good!");
                } else {
                    System.out.println("Enter Valid Marks out of 100");
                }
            } else {
                System.out.println("Enter Valid Input! \nChoose Between 0 and 1");
            }

        } while (choice != 0);

        System.out.println("Marks dont matter but our effort does.");
        sc.close();
    }

};
