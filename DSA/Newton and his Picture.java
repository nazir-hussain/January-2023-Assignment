import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        int[][] photos = new int[N][2];

        for(int i=0; i<N; i++){
            photos[i][0] = sc.nextInt();
            photos[i][1] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int W = photos[i][0];
            int H = photos[i][1];

            if(Math.min(W, H) < L){
                System.out.println("UPLOAD ANOTHER");
            }else if(W == H){
                System.out.println("ACCEPTED");
            }else{
                System.out.println("CROP IT");
            }
        }
    }
}
