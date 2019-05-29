import comparable.Comparable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        shapes[3] = new Shape();

        Circle circle = (Circle) shapes[0];
        System.out.println("Dien tic la "  + circle.getArea());
        Square square = (Square) shapes[2];
        square.howToColor();

    }
}
