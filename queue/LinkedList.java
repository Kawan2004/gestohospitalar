package queue;

import patient.Patient;

public class LinkedList {
    
    private Node head = null;
    private Node tail = null;
    private int size;

    public void add (Patient value) {
        Node node = new Node(value);

        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            this.size++;
        }

        else {
            this.tail.setNext(node);
            node.setPrevious(this.tail);
            this.tail = node;
            this.size++;
        }
    }

    public Node getHead () {
        return this.head;
    }

    public Node getTail () {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    public void setHead (Node head) {
        this.head = head;
    }

    public void setTail (Node tail) {
        this.tail = tail;
    }

    public void setSize (int size) {
        this.size = size;
    }
}
