
import java.util.*;

public class Month {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enterthe Number of the Month (1 to 12): ");
        int number = sc.nextInt();

        String month = "";
        int days = 0;

        switch (number) {
            case 1:
                month = "January";
                days = 31;
                break;

            case 2:
                month = "February";
                days = 28;
                break;

            case 3:
                month = "March";
                days = 31;
                break;

            case 4:
                month = "April";
                days = 30;
                break;

            case 5:
                month = "May";
                days = 31;
                break;

            case 6:
                month = "June";
                days = 30;
                break;

            case 7:
                month = "July";
                days = 31;
                break;

            case 8:
                month = "August";
                days = 31;
                break;

            case 9:
                month = "September";
                days = 30;
                break;

            case 10:
                month = "October";
                days = 31;
                break;

            case 11:
                month = "November";
                days = 30;
                break;

            case 12:
                month = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid Month Number!");
                sc.close();
                return;

        }

        System.out.println("Month is: " + month);
        System.out.println("Total Days in " + month + " Month are: " + days);
        sc.close();

    }
}
