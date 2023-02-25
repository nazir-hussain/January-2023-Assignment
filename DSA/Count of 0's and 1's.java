
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            sum = sum + input;
        }

        System.out.println(sum + " " + (n - sum));
    }
}
