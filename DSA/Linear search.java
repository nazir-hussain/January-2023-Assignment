
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform the linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
