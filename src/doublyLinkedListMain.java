import java.util.Scanner;
import DoublyLinkedList.DoublyLinkedList;




public class DoublyLinkedListMain{

    static DoublyLinkedList l = DoublyLinkedList.listInstance;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input file name: ");
        String input = scan.next();

        System.out.println();
        System.out.println("Input: ");
        l.parseInput(input);

        System.out.println();
        System.out.println("Output: ");
        l.runInstructions();
        l.print();
      }
}
