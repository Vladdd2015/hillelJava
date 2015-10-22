package collection;

import OOP.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HillelStudent on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {
       List<Cat> cats = new ArrayList<Cat>();

        cats.add(new Cat(false,10,"tom","black"));


    }

    private static void generic() {
        //generic
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat(false,10,"tom","black"));
    }

    private static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false, 10, "tom", "black"));
        list.add(10);
        list.add("word");

        for (Object o : list) {
            System.out.println(o);
        }

        Cat cat = (Cat) list.get(0);
        Integer i = (Integer) list.get(1);
        String s = (String) list.get(2);
    }
}
