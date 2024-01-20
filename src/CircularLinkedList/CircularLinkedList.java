package CircularLinkedList;

public class CircularLinkedList {
    CircularNode head;
    CircularNode tail;

    public CircularLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtHead(int data){
        CircularNode newNode = new CircularNode(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next=head;
        }
    }

    public void deleteHead(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail=null;
            return;
        }

        CircularNode temp = head;
        head = head.next;
        tail.next=head;
        temp.next=null;
    }

    public void deleteTail(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        CircularNode prev = head;
        while(prev.next != tail){
            prev = prev.next;
        }
        tail = prev;
        tail.next = head;
    }

    public void printCircularLinkedList(){
        CircularNode currentNode = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        do{
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        while(currentNode !=head);
    }
}
