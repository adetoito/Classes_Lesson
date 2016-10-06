package com.company;

/**
 * Created by ad100 on 10/6/16.
 */
public class Circle {

    public double radius;

    // State variable ^

    public Circle (double r) {

        // doubles are what the constructor accepts.
        // r is a placeholder.

        radius = r;

    } // The above is known as a constructor.

    public double area () {

        // public - Accessed by anyone.
        // double - What it returns.
        // area - Constructor.
        // () - What the constructor accepts (doesn't accept anything).

        double a = Math.PI * (radius * radius);
        return a;

        // Requires return statement.

    }

    public double circumference () {

        double c = Math.PI * (2 * radius);
        return c;

    }

    public double diameter () {

        double d = 2 * radius;
        return d;

    }

}
