import java.util.Scanner;
        import Stack.StackImpl;

public class StackMain {
    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input file name: ");
        String input = scan.next();
        System.out.println();
        System.out.println("Input: ");
        s.parseInput(input);

        System.out.println();
        System.out.println("Output: ");

        s.runInstructions();
        s.viewStack();

    }
}
