package com.company;

public class Main {

    public static void main(String[] args) {

        // Circle ted = new Circle(25.2);

        // Created a circle of 25.2 - has no meaning.

        // System.out.println(ted.radius);

        // ted is the Circle.
        // radius is the constructor.

        /*
        double tedArea = ted.area();
        System.out.println(tedArea);
        */

        // Prints out ted's area.

        Circle frank = new Circle(30.5);

        double frankDiameter = frank.diameter();
        System.out.println(frankDiameter);

        double frankArea = frank.area();
        System.out.println(frankArea);

        double frankCircumference = frank.circumference();
        System.out.println(frankCircumference);

    }
}
