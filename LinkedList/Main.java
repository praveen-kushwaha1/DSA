public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting data into the linked list
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        // Traversing the linked list
        System.out.print("Linked List: ");
        linkedList.traverse();
    }
}
