package homeWork;

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



        RectangleTask rect1 = new RectangleTask(22, 30);
        RectangleTask rect2 = new RectangleTask(16, 7);
        RectangleTask rect3 = new RectangleTask(14, 12);
        RectangleTask rect4 = new RectangleTask(3, 5);
        System.out.println(rect1.getRectangle());
        System.out.println(rect2.getRectangle());
        System.out.println(rect3.getRectangle());
        System.out.println(rect4.getRectangle());


    }
}
