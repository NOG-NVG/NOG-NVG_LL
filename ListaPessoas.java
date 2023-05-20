public class ListaPessoas {
    Node head;
    Node tail;

    ListaPessoas() {
    }

    public ListaPessoas(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "ListaPessoas{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
