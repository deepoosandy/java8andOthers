package com.practice.turing;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape("S1", 286));
        shapeList.add(new Shape("S2", 512));
        shapeList.add(new Shape("S3", 268));
        shapeList.add(new Shape("S4", 258));
        shapeList.add(new Shape("S5", 431));
        shapeList.add(new Shape("S6", 289));
        Shape s = shapeList.stream().reduce(shapeList.get(0), (a, b) -> a.getDiameter() > b.getDiameter() ? a : b);
        System.out.println(s);

    }
}

class Shape {
    private String name;
    private double diameter;

    public Shape(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("%s [%.2f]", name, diameter);
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }
}
