package OOP;

/**
 * Created by VPalienko on 05.10.2015.
 */
public class Cat extends Animals {
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

    public boolean equals(Cat other){
        if(pet != other.pet ) return false;
        if(age != other.age) return false;
        if (!name.equals(other.name)) return false;
        if (!color.equals(other.color)) return false;
        return true;
    }
    public String makeSound(){
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
