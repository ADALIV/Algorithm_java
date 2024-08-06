package list;

public class pointer {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(0, null);
        Node<Integer> current = head;

        for (int i=1; i<10; i++) {
            current.next = new Node<>(i, null);
            current = current.next;
        }

        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node<E> {
    public E data;
    public Node<E> next;

    Node(E data, Node<E>next) {
        this.data = data;
        this.next = next;
    }
}
