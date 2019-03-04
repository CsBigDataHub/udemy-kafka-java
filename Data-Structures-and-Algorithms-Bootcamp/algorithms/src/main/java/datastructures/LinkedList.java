package datastructures;

public class LinkedList<T> {

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addFront(T data) {

        // Create new node
        Node newNode = new Node(data);

        // if head...
        if (head == null) {
            head = newNode;
            return;
        }

        if (tail == null) {
            tail = head;
            newNode.next = tail;
            head = newNode;
            return;
        }

        // Set it's next to current head
        newNode.next = head;

        // Set current head equal to this new head
        head = newNode;
    }

    public T getFirst() {
        return head.data;
    }

    public T getLast() {
//        if (head == null) {
//            throw new IllegalStateException("Empty list!");
//        }
//
//        Node current = head;
//
//        // while we are not at the tail
//        while (current.next != null) {
//            current = current.next; // O(n)
//        }
//
//        // We are at the tail
//        return current.data;

        if (tail == null) {
            return head.data;
        }
        return tail.data;
    }

    public void addBack(T data) {
//        Node newNode = new Node(data);
//
//        // if head... set and return
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        // Else starting at head...
//        Node current = head;
//
//        // Walk until to hit tail
//        while (current.next != null) {
//            current = current.next;
//        }
//
//        // Set current node to equal newNode
//        current.next = newNode;

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (tail == null) {
            tail = newNode;
            head.next = tail;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

}
