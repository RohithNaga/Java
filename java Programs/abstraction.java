package practisePrograms;
import java.util.*;

abstract class shape {
    String color;
    abstract double area();
    public abstract String toString();

//    public shape(String color) {
//        System.out.println("shape constructor called");
//        this.color = color;
//    }
    public String getcolor() {
        return color;
    }
}

class circle extends shape {
    int radius;

    public circle(String color, int radius) {
        this.color = color;
        System.out.println("circle const called");
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "circle color is :" + super.getcolor() + " and the area is: " + area();
    }
}

class rect extends shape {
    int len, wid;

    public rect (String color, int len, int wid) {
//        super(color);
        this.color = color;
        System.out.println("rect const called");
        this.len = len;
        this.wid = wid;
    }
    @Override
    double area() {
        return len * wid;
    }
    @Override
    public String toString() {
        return "The color of the rectangle is: " + super.getcolor() + " and the area is: " + area();
    }
}

public class abstraction {
    public static void main(String[] args) {

        shape s1  =new circle("red", 5);
        shape s2 = new rect("blue", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}

