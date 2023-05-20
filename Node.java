public class Node {
    Pessoa value;
    Node next;

    Node() {
    }

    public Node(Pessoa value) {
        this.value = value;
        this.next = null;
    }

    public Node(Pessoa value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
