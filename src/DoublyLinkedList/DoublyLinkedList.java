package DoublyLinkedList;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;

    public void addNode(int data){
        DoublyNode newNode = new DoublyNode(data);

        if(head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void deleteNodeAtEnd(){
        DoublyNode selectedNode = this.tail;
        if(head ==null){
            System.out.println("There are no nodes to be deleted");
        }
        else
        {
            this.tail = selectedNode.previous;
            this.tail.next = null;
            selectedNode.previous = null;
        }
    }

    public void addAtStart(int data){
        DoublyNode newNode = new DoublyNode(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            newNode.previous = newNode;
            head = newNode;
        }
    }

    public void insertAt(int data, int key){
        DoublyNode current = head;
        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == null){
            System.out.println("Key not found");
        }
        else {
            DoublyNode newNode = new DoublyNode(data);
            newNode.next = current.next;
            current.next = newNode;
            newNode.previous = current;

            if(newNode.next != null){
                newNode.next = newNode.previous;
            }
            else{
                tail = newNode;
            }
        }
    }

    public void display(){
        DoublyNode current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
