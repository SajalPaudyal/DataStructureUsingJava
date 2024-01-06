public class Main {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(8);

        list.insertAtStart(50);
        list.insertAtAnyLocation(0,43);

        list.show();

        System.out.println("After deletion");

        list.deleteAtALocation(2);
        list.show();

    }
}
