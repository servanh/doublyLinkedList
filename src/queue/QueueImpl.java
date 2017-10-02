package queue;
import doublyLinkedList.doublyLinkedList;
import doublyLinkedList.doublyLinkedDelete;
public class QueueImpl implements Queue {
    doublyLinkedList l = new doublyLinkedList();
    doublyLinkedDelete d = new doublyLinkedDelete();

    @Override
    public void enQueue(int value) {
        l.addAtEnd(value);
    }

    @Override
    public void deQueue() {
        d.deleteFromStart();
    }

    @Override
    public void displayQueue() {
        l.print();
    }
}
