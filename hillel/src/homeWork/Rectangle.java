package homeWork;

import java.util.Scanner;

/**
 * Created by Влад on 15.10.2015.
 */
public class Rectangle {
    public double height;
    public double width;
    public String toString()
    {
        return "height is " + height + " and width is " + width;
    }


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter perimetr and area of your rectangle: ");
        RectangleTask rect1 = new RectangleTask(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter perimetr and area of your rectangle: ");
        RectangleTask rect2 = new RectangleTask(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter perimetr and area of your rectangle: ");
        RectangleTask rect3 = new RectangleTask(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter perimetr and area of your rectangle: ");
        RectangleTask rect4 = new RectangleTask(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(rect1.getRectangle());
        System.out.println(rect2.getRectangle());
        System.out.println(rect3.getRectangle());
        System.out.println(rect4.getRectangle());


    }
}
