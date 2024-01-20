package DoublyLinkedList;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList doublylist = new DoublyLinkedList();
        doublylist.addNode(1);
        doublylist.addNode(2);
        doublylist.addNode(3);
        doublylist.addNode(4);

        System.out.println("----- Addition of nodes serially -----");
        doublylist.display();

        doublylist.addAtStart(7);
        System.out.println("----- Adding node at the start -----");
        doublylist.display();

        doublylist.insertAfter(11,3);
        System.out.println("---- Adding node at the 4th location(After 3rd) ----");
        doublylist.display();
    }

}

/*
OUTPUT
----- Addition of nodes serially -----
1
2
3
4
----- Adding node at the start -----
7
1
2
3
4
---- Adding node at the 4th location(After 3rd) ----
7
1
2
3
11
4
 */
