package Week9;

public class LinkedList<E> {
    private Node<E> head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node<E> head) {
        this.head = head;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }
    
}
