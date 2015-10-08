package OOP;

/**
 * Created by VPalienko on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        String sound = tomCat1.makeSound();

        System.out.println(sound);

        Animals animal = new Animals();

        Cat cat = new Cat();

        Animals animalCat = new Cat();


        Object cat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Object cat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(cat1.equals(cat2));

        Object[] objects = new Object[10];

        objects[0] = "some string";
        objects[1] = new Cat(true, 3, "Tom", "Blue-gray");;
        objects[2] = System.in;

        System.out.println(objects[1]);

        //something();
    }

    public static void something() {
        if (Cat.domestic) {
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator) {
            System.out.println("Cat is predator");
        }
        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");


        Cat murzik = new Cat(true, 4, "Murzik", "Black");


        System.out.println(tomCat.name);
        System.out.println(murzik.age);
    }
}
