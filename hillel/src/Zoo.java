/**
 * Created by VPalienko on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
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
