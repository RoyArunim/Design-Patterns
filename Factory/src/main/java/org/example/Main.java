package org.example;

import Factory.Circle;
import Factory.IShape;
import Factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj=new ShapeFactory();
        IShape shapeObj=shapeFactoryObj.getShape("CIRCLE");
        shapeObj.perimeter();
        shapeObj.draw();


    }
}