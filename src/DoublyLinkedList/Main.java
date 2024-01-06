package DoublyLinkedList;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList doublylist = new DoublyLinkedList();
        doublylist.addNode(1);
        doublylist.addNode(2);
        doublylist.addNode(3);
        doublylist.addNode(4);

        doublylist.display();

        doublylist.addAtStart(7);
        doublylist.display();
    }

}
