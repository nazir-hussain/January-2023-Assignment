import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);

// System.out.println(“Enter your value”);

    int n=sc.nextInt();

    for(int i=1;i<=n;i++){

        // System.out.println(i+" "+i*i+" "+i*i*i);
        System.out.println(i*i);
        }
    }
}
