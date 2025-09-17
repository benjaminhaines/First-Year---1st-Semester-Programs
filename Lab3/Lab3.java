import java.util.*;
/* Author: Benjamin Haines
   Class: COSC: 10403
   Date: 9/16/2025
   This program allows the user to input a number and
   prints the last digit along with the last 2 digits of 
   the user's number*/
public class Lab3{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int userInput; //Whatever the user inputs as his/her number
        int lastDigit; //Variable that'll display last digit of user's number
        int lastTwoDigits; //Variable that'll display last 2 digits of user's number

        //Get's user input of integer
        System.out.println("Enter your number: ");
        userInput = keyboard.nextInt();

        //Calculate's last digit of user's number and prints it to the user
        lastDigit = Math.abs(userInput)%10;
        System.out.println("Last digit: " + lastDigit);

        //Calculate's last two digits of user's number and prints it to the user
        lastTwoDigits = Math.abs(userInput)%100;
        String formatted = String.format("%02d", lastTwoDigits);
        System.out.println("Last 2 Digits: " + formatted);
        
    


    
    }
}
