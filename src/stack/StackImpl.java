package stack;
import doublyLinkedList.doublyLinkedList;
import doublyLinkedList.doublyLinkedDelete;

public class StackImpl implements Stack {
    public doublyLinkedList l = new doublyLinkedList();
    public doublyLinkedDelete d = new doublyLinkedDelete();

    public void push(int value)
    {
        l.addAtStart(value);
    }
    public void pop()
    {
         d.deleteFromStart();
    }
    public int size()
    {
        return l.getSize();
    }

}
