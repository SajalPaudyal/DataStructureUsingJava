package ArrayListAndLinkedList;

/*
Both Arraylist and LinkedList are the dynamic data structures that are used to store a collection of elements.

Java.utils.ArrayList -> stores element in contiguous memory location. This makes it efficient for random access i.e. accessing element by index.
Insertion and deletion of elements at the start of end of the list, as this process require shifting element in array.
 */

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){
        ArrayList<Integer> numbers  = new ArrayList<>();

        //Add into arrayList
        numbers.add(7);
        numbers.add(11);
        numbers.add(17);
        numbers.add(33);
        numbers.add(43);
        numbers.add(54);
        numbers.add(67);

        //Remove from the arrayList
        numbers.remove(1); // This removes the first element (It is the index, not the value)
        numbers.remove(0); // This removes the second element
        numbers.remove(3); // This removes the third element


        //Add a number in desired index
        numbers.add(0, 6);

        //check the size of arrayList
        System.out.println(numbers.size());

        //remove the last element from the arrayList
        numbers.remove(numbers.size()-1);

        //Print the arrayList
        System.out.println(numbers.toString());

        //ArrayList with Strings
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("John Doe");
        nameList.add("Chris Samuels");
        nameList.add("Leonardo DiCaprio");
        nameList.add("Samuel L Jackson");

        nameList.add(4, "Joseph Argon");

        System.out.println(nameList.toString());

        nameList.remove(4);

        System.out.println(nameList.toString());
    }
}
