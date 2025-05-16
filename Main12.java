// Main class
public class Main12 {
    public static void main(String[] args) {
        // Runtime polymorphism: Shape reference, Area object
        Shape12 shape = new Area12();

        // Call all three methods
        shape.rectangleArea(10, 5);
        shape.squareArea(7);
        shape.circleArea(3.5);
    }
}

