package LinkedLists;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBegin(new ListNode(4));
        linkedList.insertAtEnd(new ListNode(15));
        linkedList.insertAtEnd(new ListNode(7));
        linkedList.insertAtEnd(new ListNode(40));

        linkedList.insert(11, 1);

        System.out.println(linkedList.toString());
    }
}
