
import java.util.Scanner;
public class MathLearner
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.println("Enter X: ");
        x = keyboard.nextDouble();
        System.out.println("Enter Y: ");
        y = keyboard.nextDouble();
        System.out.println("Enter Z: ");
        z = keyboard.nextDouble();
        double powerxz = Math.pow(x, z);
        System.out.println("X to the power of Z is: " + powerxz);
        double poweryz = Math.pow(y,z);
        double powerxyz = Math.pow (x,poweryz);
        System.out.println("X to the power of Y to the Power of Z is: " + powerxyz);
        double absvaly = Math.abs(y);
        System.out.println("The absolute value of Y is: " + absvaly);
        double product = x*y;
        double powerproduct = Math.pow(product,z);
        double squareroot = Math.sqrt(powerproduct);
        System.out.println("The square root of (X times Y) to the power of Z: " + squareroot);     
    }
}