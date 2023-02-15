package be.intecbrussel;

public class Rectangle {
    // properties
    private int length;
    private int width;

    private static int counter = 0;

    // constructors
    public Rectangle() {
        counter++;
        // no-args constructor
    }

    public Rectangle(int length, int width) {
        counter++;
        this.length = length;
        this.width = width;
        // all-args constructor
    }

    // getters and setters
    public static int getCounter() {
        return counter;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // my methodes
    public static void myRectangleMessage() {

        System.out.println("Hi");
    }

    public void myRectangleMessage(String name) {
        System.out.println("Hi" + name);
    }


//    public static int getArea(int length, int width) {
//        return length * width;
//    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getArea(int length, int width) {
        return length * width;
    }

    public int getArea(int length) {
        return length * this.width;
    }

    public double getArea(double length, double width) {
        return length * width;
    }
}
