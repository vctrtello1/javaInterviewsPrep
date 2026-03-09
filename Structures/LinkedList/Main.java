package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Head of the Linked List:");
        list.getHead();
    }
}
