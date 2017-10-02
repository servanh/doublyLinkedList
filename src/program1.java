import java.util.Scanner;
import doublyLinkedList.doublyLinkedList;
import doublyLinkedList.doublyLinkedDelete;
import doublyLinkedList.doublyLinkedSearch;
import queue.QueueImpl;
import stack.StackImpl;




public class program1 {

    static doublyLinkedList l = doublyLinkedList.listInstance;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        l.parseInput(scan.next());
       /* listInstance.addAtStart(1);
        listInstance.addAtStart(2);
        listInstance.addAtStart(5);
        listInstance.print();
        doublyLinkedSearch s = new doublyLinkedSearch();
        s.search(5);*/

        //Node x = d.addAtStart(2);
        /*d.addAtStart(1);
        d.print();
        d.addAtEnd(3);
        d.print();
        d.addAfter(4,x);
        d.print();
        d.deleteFromStart();
        d.print();
        System.out.println("Element at index 2: "+d.elementAt(2));
        d.addAtStart(1);
        d.print();
        d.deleteFromEnd();
        d.print();
        System.out.println("Size of the Linked List: " + d.getSize());
    */}
}
