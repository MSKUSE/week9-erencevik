import java.util.ArrayList;

public class TestAbstractShapes {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.toString());

        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1.toString());

        Shape square = new Rectangle(3, 3);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square.toString());

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(rectangle);
        shapes.add(rectangle1);
        shapes.add(square);

        for (int i = 0; i < 3; i++) {
            System.out.println(shapes.toString());
        }
    }
}
