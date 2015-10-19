package wrapers;

import java.util.Objects;

/**
 * Created by HillelStudent on 19.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int iPrimitive = 1;
        Integer first = iPrimitive;
        Integer second = 1;
        Double d = 2.3;
        Byte b = 20;
        Boolean bool = false;

        System.out.println(first == second);

        first = 128;
        second = 128;

        System.out.println(first == second);

        Object [] ints = new Object[5];
        ints[0] = 1;
        ints[1] = new Integer[12];
    }
}
