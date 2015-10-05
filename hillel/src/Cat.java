/**
 * Created by VPalienko on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    int age;
    String name;
    String color;

    public Cat(){
        System.out.println("is cat's constructor");
    }



    public Cat(boolean isPet, int howManyYears, String whatsName, String color){
       pet = isPet;
        age = howManyYears;
        name = whatsName;
        this.color = color;
    }

}
