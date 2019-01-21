package LinkedLists;

public class LinkedList {

    // este atributo contiene el head de la lista
    private ListNode head;

    private int length;

    public LinkedList() {
        length = 0;
    }

    /**
     * Inserta un nodo al comienzo de la lista
     * @param node
     */
    public synchronized void insertAtBegin(ListNode node) {

        node.setNext(head);
        head = node;
        length++;
    }

    /**
     * Inserta un nodo al final de la lista
     * @param node
     */
    public synchronized void insertAtEnd(ListNode node) {

        if (head == null)
            head = node;

        else {

            ListNode p, q;

            // recorro hasta el final de la lista y a la siguiente pos de p le asigno el nuevo nodo
            for (p = head ; (q = p.getNext()) != null ; p = q);
                p.setNext(node);
        }

        length++;
    }

    /**
     * Inserta un dato en un nuevo nodo en una posicion determinada
     * @param data
     * @param position
     */
    public void insert(int data, int position) {

        if (position < 0) position = 0;

        if (position > length) position = length;

        if (head == null)
            head = new ListNode(data);

        else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        }

        else {
            ListNode temp = head;
            //temp tiene la posicion 0, se inicia i en 1
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }

            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);

        }

        length++;

    }

    @Override
    public String toString() {
        String result = "[";

        if (head == null) {
            return result+"]";
        }

        result = result + head.getData();
        ListNode temp = head.getNext();

        while (temp != null) {
            result = result + "," + temp.getData();
            temp = temp.getNext();
        }

        return result + "]";
    }

    /**
     * @return el primer nodo en la lista
     */
    public synchronized ListNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
}
