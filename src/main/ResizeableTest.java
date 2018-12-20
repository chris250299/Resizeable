package main;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle();
        shapes[2] = new Square(2);
        System.out.println("Pre-changed: ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("After-changed: ");
        Resizeable resizeable = (Circle) shapes[0];
        resizeable.resize(2);
        Resizeable resizeable1 = (Rectangle) shapes[1];
        resizeable1.resize(3);
        Resizeable resizeable2 = (Square) shapes[2];
        resizeable2.resize(4);
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);
    }
}
