package queue;

import patient.Patient;

public class Node {
    
    private Patient value;
    private Node next;
    private Node previous;

    public Node (Patient value){
        this.value = value;
    }

    public Patient getValue () {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious (Node previous) {
        this.previous = previous;
    }

    public void setValue (Patient value) {
        this.value = value;
    }

    public void setNext (Node next) {
        this.next = next;
    }

}
