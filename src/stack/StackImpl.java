package stack;
import doublyLinkedList.doublyLinkedList;
import doublyLinkedList.doublyLinkedDelete;

public class StackImpl implements Stack {
    public doublyLinkedList l = new doublyLinkedList();
    public doublyLinkedDelete d = new doublyLinkedDelete();

    @Override
    public void push(int value)
    {
        l.addAtStart(value);
    }
    @Override
    public void pop()
    {
         d.deleteFromStart();
    }
    @Override
    public int size()
    {
        return l.getSize();
    }

}
