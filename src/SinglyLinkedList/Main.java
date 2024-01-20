package SinglyLinkedList;

import SinglyLinkedList.LinkedList;

public class Main {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(8);

        System.out.println("----- Show the initial list -----");
        list.show();

        list.insertAtStart(50);
        System.out.println("----- Insert an element at the start and print the list ------");
        list.show();

        list.insertAtAnyLocation(1,43);
        System.out.println("----- Insert a data at a certain location and print the list -----");
        list.show();

        list.deleteAtALocation(2);
        System.out.println("-----After deletion of data at a certain index-----");
        list.show();

    }
}

/*
----- Show the initial list -----
3
4
8
----- Insert an element at the start and print the list ------
50
3
4
8
----- Insert a data at a certain location and print the list -----
50
43
3
4
8
-----After deletion of data at a certain index-----
50
43
4
8
 */
