import java.util.*;

/* This Program/Project is designed to have user input for 2 numbers
and allows the user to multiply, divide, add, subtract, and modulus. I'll also add exponents and square root. */

public class Calculator{
    public static void main(String[] args) {
        //Variables used to store users input for number, fix division by 0, hold operators, and boolean
        try (Scanner keyboard = new Scanner(System.in)) {
            double num1, num2;
            double result = 0;
            char operator;
            boolean validOperation = true;

            //Getting user's first number
            System.out.println("Enter your first number: ");
            num1 = keyboard.nextDouble();

            //Prompting User to choose an operation
            System.out.println("Enter an Operator + (to add), - (to subtract), * (to multiply), / (to divide), % (to find remainder), ^ (to find exponential),"
                              + " r(to find the square root of one number)";
            operator = keyboard.next().charAt(0);

            //Getting user's second number
            System.out.println("Enter your second number: ");
            num2 = keyboard.nextDouble();

            //Executing User's Input with their chosen operation
            switch(operator){
                case '+' -> result = num1 + num2; //Adds both Numbers
                case '-' -> result = num1 - num2; //Subtracts both Numbers
                case 'r' -> result = Math.sqrt(num1); //Square root of 1st user input number
                case '*' -> result = num1 * num2; //Multiplies both Numbers
                case '%' -> result = num1 % num2; //Finds the remainder of the first number 
                //Helps user know that they can't divide by 0 and prevents it by making the boolean variable turn false to prevent any calculations being done.
                case '/' -> {
                    if(num2 == 0){
                        System.out.println("Cannot divide by zero!"); 
                        validOperation = false;
                    }
                    //Divides both Numbers as long as num2 isn't 0
                    else{
                        result = num1 / num2; 
                    }
                }
                //First number is raised to the power of whatever the 2nd number is
                case '^' -> result = Math.pow(num1, num2); 
                //If user doesn't put in the correct operator, no calculations are done
                default -> {
                    System.out.println("Invalid operator!"); 
                    validOperation = false;
                }
            }   
            //If everything goes right, user should get the number he wants calculated
            if(validOperation){ 
            System.out.println("This is your calculated number: " + result);
            }
        }
    }
}
