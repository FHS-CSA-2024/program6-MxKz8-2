//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        double radius = 0;
        final double pi = 3.14159;
        
        System.out.println("Enter your radius:");
        radius = myScanner.nextDouble();
        
        double diameter = 2.0 * radius;
        diameter = (double) Math.round(diameter*10.0*10.0*10.0)/1000.0;
        
        double area = (double) pi * Math.pow(radius, 2);
        area = (double) Math.round(area*10.0*10.0*10.0)/1000.0;
        
        double circumference = 2.0 * radius * pi;
        circumference = (double) Math.round(circumference*10.0*10.0*10.0)/1000.0;
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
        
        System.out.println();
        System.out.println("This program was written by:");
        System.out.println("Kyle Tan on 8/20/24 in 1st period");
    }
}
//Paste console output below:
/*

Enter your radius:
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

This program was written by:
Kyle Tan on 8/20/24 in 1st period

*/
