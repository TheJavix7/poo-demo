package ejAreas;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangulo = new Rectangle(20, 10);
        Circle circulo = new Circle(10);
        Triangle triangulo = new Triangle(20, 10);

        Shape[] shapes = {rectangulo, circulo, triangulo};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }

    }
}
