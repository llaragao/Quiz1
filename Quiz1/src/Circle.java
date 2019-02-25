import java.util.Scanner;

public class Circle {



    private double radius;
    private double area;
    private double diamter;
    double pi = 3.14159;

    public void Circle(double r){
        radius = r;

    }
    public double area(){
        return ((radius * radius) * 3.14);
    }

    public double circumference(){
        return radius * 2 * pi;
    }
    public double getRadius(){
        return radius;
    }

}