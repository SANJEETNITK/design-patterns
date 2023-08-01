package solid_design_pattern.liskov;

public class LiskovExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.6, 5.0);
        Shape square = new Square(8.0);

        Shape[] shapes = new Shape[] {rectangle, square};
        System.out.println(ShapeAreaCalculator.calculateTotalArea(shapes));
    }
}

