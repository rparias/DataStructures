package LinkedLists;

public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }


    /**
     * La función ListLength toma una linked list como entrada y cuenta el numero de nodos en la lista
     * @param headNode
     * @return int con el tamaño de la lista
     *
     * Time Complexity: O(𝑛), for scanning the list of size 𝑛. Space Complexity: O(1), for creating temporary variable.
     */
    public int ListLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }

        return length;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
