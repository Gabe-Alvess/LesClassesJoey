package be.intecbrussel;

public class Shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,9);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();

        rectangle1.setWidth(100);
        rectangle1.setLength(1000);

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());

        System.out.println(Rectangle.getCounter());
        System.out.println(rectangle1.getArea());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getArea(6, 8));
        System.out.println(rectangle.getArea(5.8, 7));

        rectangle3.myRectangleMessage("Gabriel");
        Rectangle.myRectangleMessage();

    }


}
