import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int i=0;

        if(a!=b&&d !=c || a!=c&&b !=d || a!=d&&b !=c){
            i=2;
            System.out.print(i);
        }
        else if(a!=b&&d ==c || a!=c&&b ==d || a!=d&&b ==c){
            i=1;
            System.out.print(i);
        }
        else
            System.out.print(0);
    }
}
