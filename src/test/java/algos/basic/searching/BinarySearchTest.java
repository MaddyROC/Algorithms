package algos.basic.searching;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vinay on 3/10/18.
 */
public class BinarySearchTest {
    @Test
    public void binarySearchRecursiveTest(){
        BinarySearchRecursive bs = new BinarySearchRecursive();
        int [] sortedArray = {1, 2, 3, 7, 10, 300, 400, 30000}; 
        int expectedIndex = bs.runBinarySearchRecursively(sortedArray, 7, 0, sortedArray.length - 1);
        Assert.assertEquals(expectedIndex, 3);
    }

    @Test
    public void binarySearchIterativeTest(){
        BinarySerarchIterative bs = new BinarySerarchIterative();
        int [] sortedArray = {1, 2, 3, 7, 10, 300, 400, 30000}; 
        int expectedIndex = bs.runBinarySearchIteratively(sortedArray, 7, 0, sortedArray.length  - 1);
        Assert.assertEquals(expectedIndex, 3);
    }
}