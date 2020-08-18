package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        double miles = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter gas consumed in gallons:");
        double gas = input2.nextDouble();
        input1.close();
        input2.close();
        System.out.println("Miles per gallon: " + miles/gas);
    }
}
