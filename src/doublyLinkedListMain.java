import java.util.Scanner;
import doublyLinkedList.doublyLinkedList;
import doublyLinkedList.doublyLinkedDelete;
import doublyLinkedList.doublyLinkedSearch;
import queue.QueueImpl;
import stack.StackImpl;




public class doublyLinkedListMain{

    static doublyLinkedList l = doublyLinkedList.listInstance;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        l.parseInput(scan.next());
        l.runInstructions();
        l.print();
      }
}
