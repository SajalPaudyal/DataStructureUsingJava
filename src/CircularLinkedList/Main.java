package CircularLinkedList;

public class Main {
    public static void main(String[] args){
        CircularLinkedList newCircularList = new CircularLinkedList();

        newCircularList.insertAtHead(1);
        newCircularList.insertAtHead(2);
        newCircularList.insertAtHead(3);
        newCircularList.insertAtHead(4);
        newCircularList.insertAtHead(5);
        newCircularList.insertAtHead(6);

        newCircularList.printCircularLinkedList();

        newCircularList.deleteTail();
        System.out.println("---------After Deletion of Tail---------");
        newCircularList.printCircularLinkedList();

        newCircularList.deleteHead();
        System.out.println("------ After Deletion of Head -------");
        newCircularList.printCircularLinkedList();
    }
}

/*
OUTPUT
1
2
3
4
5
6
---------After Deletion of Tail---------
1
2
3
4
5
---------After Deletion of Head---------
2
3
4
5
 */
