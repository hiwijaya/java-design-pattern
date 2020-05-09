package com.hiwijaya.pattern.factorymethod;

enum ShapeKind {
    LINE, RECTANGLE, CIRCLE
}

public class ShapeFactory {

    public static Shape createShape(ShapeKind kind){
        Shape shape = null;
        switch (kind){
            case LINE:
                shape = new Line();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
        }
        return shape;
    }

}
class Main2 {
    public static void main(String[] args) {
        Shape line = ShapeFactory.createShape(ShapeKind.LINE);
        line.draw();
        Shape circle = ShapeFactory.createShape(ShapeKind.CIRCLE);
        circle.draw();

    }
}


