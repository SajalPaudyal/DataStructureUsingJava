public class Main {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(8);

        list.insertAtStart(50);
        list.insertAtAnyLocation(2,43);
        list.show();

    }
}
