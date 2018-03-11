package algos.basic.searching;

/**
 * Created by Madhusudan on 3/10/18.
 */
public class BinarySearchRecursive {
    public int runBinarySearchRecursively(
            int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}
