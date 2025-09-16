/*
Assignment: Lab 1
Name: Benjamin Haines
Email: ben.haines@tcu.edu
Class-Section: COSC10403
Overview:
This program demonstrates the use of variables, basic types and printing special characters to the system console.
*/
public class Lab1{
    public static void main(String[] args)
    {
        String name = "Benjamin Haines";
        byte number = 21;
        short number1 = 2100;
        int number2 = 654321;
        long number3 = 123456789;
        float number4 = 3.5f;
        double number5 = 3.567;
        char value = 'B';

        System.out.println("\"I love to watch movies.\"\n");
        System.out.println("Lab1 " + name + "'s First Lab.");
        System.out.println("My primitive data types: " + number
        + " " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + value);
    }
}