package algos.basic.searching;

import algos.basic.sorting.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Madhusudan on 3/10/18.
 */
public class InsertionSortTest {
    @Test
    public void insertionSortSimpleTest(){
        InsertionSort insertionSort = new InsertionSort();
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = insertionSort.doInsertionSort(arr1);
        int[] expectedOutput = {2, 7, 10, 34, 42, 56, 67, 88};
        Assert.assertArrayEquals(arr2, expectedOutput);
    }
}
