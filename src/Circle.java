import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private String color;



    // CONSTRUCTOR
    public Circle() {
        this.radius = 2;
        this.color = "green";

    }

    // SECOND OVERLOADED CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;
        this.color = "green";
    }

    // THIRD OVERLOADED CONSTRUCTOR
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    // RADIUS GETTER METHOD
    public double getRadius() {
        return radius;
    }

    // COLOR GETTER METHOD
    public String getColor() {
        return color;
    }

    // CALCULATE TOTAL AREA
    public double getArea() {
        double r = getRadius();
        double result = PI * r * r;
        return result;
    }

    // DESCRIPTION OF CIRCLE
    public String toString() {
        String result = "%s and %s".formatted(getRadius(), getColor());
        return result;
    }
}
