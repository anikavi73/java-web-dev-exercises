package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");

        double radius = input.nextDouble();

        System.out.println("Please enter valid number");
        // double area = Math.PI * radius *radius;
        double area = Circle.getArea(radius);

        // float radius = input.nextFloat();
        // float area = Math.PI * radius * radius;

        input.close();
        System.out.println("Area of the Circle: " + area);

    }
}
