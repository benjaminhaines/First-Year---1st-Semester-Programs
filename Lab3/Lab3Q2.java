import java.util.*;
/* Author: Benjamin Haines
   Class: COSC: 10403
   Date: 9/16/2025
   This program allows the user to input a three digit number and
   calculates sum of the digits.*/
public class Lab3Q2{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int threeDigits; // Whatever user input at his/her three digit number
        int firstDigit, secondDigit, thirdDigit; //Variables used to hold the individual digits
        int output; //Variable used to display user's sum of digits

        System.out.println("Enter your three digit number: ");
        threeDigits = keyboard.nextInt();

        //Calculates and gets individual digits of the 3 digits number and adds them up
        firstDigit = Math.abs(threeDigits)/100;
        secondDigit = (Math.abs(threeDigits)%100)/10;
        thirdDigit = Math.abs(threeDigits)%10;
        output = firstDigit + secondDigit + thirdDigit;
        
        //Prints the sum of the digits to the user
        System.out.println("Sum of the digits: " + output);



    }
}