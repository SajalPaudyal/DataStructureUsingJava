package LinearSearch;

public class LinearSearch {

    //Linear Search is a searching algorithm in which an element that if available in the list is to be searched, each element is sequentially
    // searched through the list until the desired element is found. In case of unavailability the entire list is traversed and a message is sent

    // Steps of Linear Search Algorithm

    /*
    * 1. Initialize a pointer at the start of the list
    * 2. Loop through the list
    * 3. Compare each element with the desired element
    * 4. If the element is equal to the required element, return the index of the element
    * 5. If the element is not found in the list, return -1 which indicates the unavailability of the element
    * */

    public static int LinearSearchAlgo(int [] array, int key){
        for(int i =0; i< array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int [] list = {1,2,3,4,5};
        int key = 9;

      int result =   LinearSearchAlgo(list, key);

      if(result == -1){
          System.out.println("There is no element in the list");
      }
      else System.out.println("The element "+ key+ " is at index of "+ result);
    }
}
