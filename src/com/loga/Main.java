package com.loga;

import com.loga.figures.*;

public class Main {
    public static void main(String[] args) {
        new PrintFigures().printFigureName(new Quad());
        new PrintFigures().printFigureName(new Circle());
        new PrintFigures().printFigureName(new Cube());
        new PrintFigures().printFigureName(new Oval());
        new PrintFigures().printFigureName(new Triangle());
    }
}
