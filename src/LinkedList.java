public class LinkedList {
    Node head;

    public void insert(int data){
       Node node = new Node();
       node.data = data;
       node.next= null;

       if(head == null){
           head = node;
       }
       else{
           Node n = head;
           while(n.next!=null){
               n = n.next;
           }
           n.next = node;
       }
    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtAnyLocation(int location, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;

        if (location == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < location - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAtALocation(int index){
       if(index == 0){
           head = head.next;
       }
       else{
           Node n = head;
           Node tempNode = null;
           for(int i =0; i< index -1; i++){
               n = n.next;
           }
           tempNode = n.next;
           n.next = tempNode.next;
           tempNode = null;
       }
    }
}
