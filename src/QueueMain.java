import java.util.Scanner;
import Queue.QueueImpl;

public class QueueMain {

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        System.out.println("Enter your input file name: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Input: ");
        q.parseInput(scan.next());

        System.out.println("Output: ");
        q.runInstructions();
        q.displayQueue();

    }
}
