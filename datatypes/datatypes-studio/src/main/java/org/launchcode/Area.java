package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
