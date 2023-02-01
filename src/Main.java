public class Main {
    public static void main(String[] args) {

        Circle firstCircle = new Circle();

        Circle secondCircle = new Circle(6.0);

        Circle thirdCircle = new Circle(8.0, "blue");

        System.out.println("Provided by the getter methods, the first circle's color and radius are: " + firstCircle.getColor() + " and " + firstCircle.getRadius());
        System.out.println("The total area of the first circle is " + firstCircle.getArea());
        System.out.println("Provided by the toString() method, the first circle's color and radius are: " + firstCircle.toString() + "\n");

        System.out.println("Provided by the getter methods, the second circle's color and radius are: " + secondCircle.getColor() + " and " + secondCircle.getRadius());
        System.out.println("The total area of the second circle is " + secondCircle.getArea());
        System.out.println("Provided by the toString() method, the second circle's color and radius are: " + secondCircle.toString() + "\n");

        System.out.println("Provided by the getter methods, the third circle's color and radius are: " + thirdCircle.getColor() + " and " + thirdCircle.getRadius());
        System.out.println("The total area of the third circle is " + thirdCircle.getArea());
        System.out.println("Provided by the toString() method, the third circle's color and radius are: " + thirdCircle.toString() + "\n");
    }
}