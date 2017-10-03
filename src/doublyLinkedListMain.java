import java.util.Scanner;
import DoublyLinkedList.DoublyLinkedList;




public class DoublyLinkedListMain{

    static DoublyLinkedList l = DoublyLinkedList.listInstance;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        l.parseInput(scan.next());
        l.runInstructions();
        l.print();
      }
}
