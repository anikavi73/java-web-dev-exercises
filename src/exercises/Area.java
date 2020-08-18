package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double length = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter width of the rectangle:");
        double width = input2.nextDouble();
        input1.close();
        input2.close();
        System.out.println("Area of the rectangle is " + length * width);
    }
}
