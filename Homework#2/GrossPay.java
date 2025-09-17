import java.util.*;
public class GrossPay{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hoursWorked, ratePerHour, grossPay;
        System.out.println("Enter number of hours worked: ");
        hoursWorked = keyboard.nextInt();
        System.out.println("Enter rate per hour: ");
        ratePerHour = keyboard.nextInt();
        grossPay = hoursWorked*ratePerHour;
        System.out.println("Your gross pay is: " + "$" +grossPay);
    }
}