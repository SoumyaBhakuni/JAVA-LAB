// Concrete class Area that extends Shape
class Area11 extends Shape11 {
    // Implement rectangle area
    void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Implement square area
    void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Implement circle area
    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
