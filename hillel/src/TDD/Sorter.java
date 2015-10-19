package TDD;

import java.util.Arrays;

/**
 * Created by HillelStudent on 19.10.2015.
 */
public class Sorter {
    public Integer[] sort(Integer[] array){
        Integer[] copy = Arrays.copyOf(array, array.length);

        for (int i=0; i < copy.length; i++){
            for (int j = i + 1; j <copy.length;j++){

                Integer first = copy[i];
                Integer second = copy[j];

                int g = first.compareTo(second);

                if (g > 0){
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }
}
