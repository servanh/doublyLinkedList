import java.util.Scanner;
import Stack.StackImpl;

public class StackMain {
    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        Scanner scan = new Scanner(System.in);
        s.parseInput(scan.next());
        s.runInstructions();
        s.viewStack();

    }
}
