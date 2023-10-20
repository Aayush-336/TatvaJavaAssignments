package oops;

import java.util.Scanner;

interface ShapeI {
    double size();

    void draw();

}

abstract class Shape implements ShapeI {
    void print() {
        System.out.println();
        draw();
        System.out.println("Area of shape is: " + this.size());
        System.out.println();
    }
}

class Square extends Shape {
    private final int length;

    Square(int length) {
        this.length = length;
    }

    public double size() {
        return length * length;
    }

    public void draw() {
        System.out.println("------- Drawing Square -------");
    }
}

class Rectangle extends Shape {
    private final int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double size() {
        return length * width;
    }

    public void draw() {
        System.out.println("------- Drawing Rectangle -------");
    }
}

class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double size() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("------- Drawing Circle -------");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    Enter Choice: 1) Circle
                                  2) Square
                                  3) Rectangle
                                  4) Exit
                    """);
            int choice = scanner.nextInt();
            Shape shape = null;
            boolean isLoopBreak = false;
            switch (choice){
                case 1:
                    System.out.println("Circle: Enter Radius");
                    shape = new Circle(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Square: Enter Length");
                    shape = new Square(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Rectangle: Enter Length");
                    int length = scanner.nextInt();
                    System.out.println("Rectangle: Enter Width");
                    int width = scanner.nextInt();
                    shape = new Rectangle(length, width);
                    break;
                case 4:
                    isLoopBreak = true;
                    break;
                default:
                    System.out.println("Enter Valid Choice!!");
                    break;
            }
            if (shape != null){
                shape.print();
            }
            if (isLoopBreak){
                System.out.println("Exiting...");
                break;
            }

        }
    }
}
