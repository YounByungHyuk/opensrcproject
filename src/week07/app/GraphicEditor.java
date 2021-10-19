package week07.app;

import week07.base.Shape;
import week07.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}