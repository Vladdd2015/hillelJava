package exception;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by HillelStudent on 05.11.2015.
 */
public class ExceptionsMain {
    public static void main(String[] args) {
        Integer i = null;

        System.out.println("before");

        try {
            System.out.println("in try block before ");
            nestedMethod1(i);
            System.out.println("in try block after");
        }catch (NullPointerException e){
            System.out.println("something wrong: " + e.toString());

        }
        System.out.println("after");
    }

    private static void nestedMethod1(Integer i){
        nestedMethod2(i);
    }

    private static void nestedMethod2(Integer i){
        i.toString();

    }
}
