import java.util.*;
public class Lab2
{
    public static void main(String[] args) {
        double firstNum, secondNum, thirdNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        firstNum = keyboard.nextDouble();
        System.out.println("Enter your second number: ");
        secondNum = keyboard.nextDouble();
        System.out.println("Enter your third number: ");
        thirdNum = keyboard.nextDouble();
        System.out.println("The sum and average of your three numbers: " + (firstNum + secondNum + thirdNum)/3);
    }

}