package queue;

import patient.Patient;
import patient.Priority;

public class Queue{
    LinkedList list = new LinkedList();

    public void push (Patient value) {
        list.add(value);
    }

    public void pop () {
        list.getHead().setNext(list.getHead().getNext());
        list.getHead().setPrevious(null);
        list.setSize(list.getSize() - 1);
    }

    public int getSize () {
        return list.getSize();
    }

    public Priority getPriority() {
        return list.getHead().getValue().getPriority()
    }
}
