//import stuff here!
import java.util.Scanner;
//Your code here
public class Program5 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        double radius = 0;
        double pi = 3.14159;
        
        System.out.println("Enter your radius:");
        radius = myScanner.nextDouble();
        
        double diameter = 2 * radius;
        diameter = Math.round(diameter*10.0*10.0)/100.0;
        
        double area = radius * radius * pi;
        area = Math.round(area*10.0*10.0)/100.0;
        
        double circumference = 2 * radius * pi;
        circumference = Math.round(circumference*10.0*10.0)/100.0;
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
        
        
    }
}
//Paste console output below:
/*


*/
