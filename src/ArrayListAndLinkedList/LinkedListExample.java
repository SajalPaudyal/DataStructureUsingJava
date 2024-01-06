package ArrayListAndLinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    /* Linked-list based data structure that stores elements in a series connected by nodes. It is efficient for insertion
    and deletion of elements at any position of the list, and there is no need of shifting of elements. But, it might require
    traversing to find a desired element in a linked list.

    It is effective to use linked list instead of array list when insertion or deletion of elements is important, especially in
    starting and ending nodes.
     */

    public static void main(String[] args){
        LinkedList<Integer> numberList = new LinkedList<>();
        //add the element at the end of the list
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        //add the element at the start of the list
        numberList.offer(2);

        int firstNumber = numberList.peek(); //just look into the first value of the LinkedList and store it in the variable firstNumber
        int poppedFirstNumber  = numberList.poll(); //look into the first value, pop it from the list and return the value
        System.out.println(firstNumber);
        System.out.println(poppedFirstNumber);
        System.out.println(numberList);
    }

}
