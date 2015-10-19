package TDD;



import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by HillelStudent on 19.10.2015.
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder() {
        Integer[] unsorted = {111,999,777,333,444,666,888,222,555};

        Sorter sorter = new Sorter();
        Integer [] sorted = sorter.sort(unsorted);

        Integer[] expected = {111,222,333,444,555,666,777,888,999};

        Assert.assertArrayEquals("Sorting is broken ", expected, sorted);


    }

    @Test
    public void sourceArrayShouldBeUnsorted(){
        Integer[] unsorted = {111,999,777,333,444,666,888,222,555};
        Integer[] expected = {111,999,777,333,444,666,888,222,555};

        Sorter sorter = new Sorter();
        sorter.sort(unsorted);
        Assert.assertArrayEquals("Source array is sorted ", unsorted,expected);
    }


}
