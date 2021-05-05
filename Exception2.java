package com.company;

import java.awt.*;

public class Exception2 {

    public static void main(){

        Point a = new Point( 5 ,10);
        Point b = new Point( 3,4 );
        point(a,b);

    }

    public static int point (Point a , Point b ) {

        int middle;
        try {
             middle = (a.y - b.y) / (a.x - b.x);
             System.out.println(middle);
            }
         catch (ArithmeticException e) {
            System.out.println("Error");
            return -1;
        }
        return -1;
    }
}
