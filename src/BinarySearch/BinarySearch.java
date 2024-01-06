package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    /*
    * Binary Search algorithm is another searching algorithm in which the entire list is divided into repeatedly until the desired element is found.
    * It is much faster and easier algorithm than linear search.
    * The time complexity of Linear search is O(n)
    * The time complexity of Binary search is O(log n)
    *
    * The algorithmic process is
    * 1. Ensure the array is well-sorted (in ascending order)
    * 2. Initialize two pointers, low -> The first element and high -> The last element of the list
    * 3. Calculate the mid using formula mid = (low+high)/2
    * 4. Compare the desired element with the thus calculated mid
    * 5. If the desired element matches with the middle, return the index of the mid-value
    * 6. If the desired element is less than the mid, set high to element on index mid-1 and again repeat step 3
    * 7. If the desired element is greater than the mid, set the low to element on index mid+1 and again repeat step 3
    * 8. If the loop ends without any findings, return no matching value found, else return the index of the desired value from the list
    * */

    public static int binarySearchAlgo(int [] list, int key){
        Arrays.sort(list);
        int low = 0;
        int high = list.length -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (list[mid] == key) {
                return mid;
            } else if (list[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    return -1;
    }

    public static void main(String[] args){
        int[] arraylist = {1,2,3,4,3,2,1};
        int key = 4;

        int result = binarySearchAlgo(arraylist, key);
        System.out.println(result);

    }
}
