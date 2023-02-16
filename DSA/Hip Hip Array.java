import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int arr[]=new int[a];
        int p=0;
        for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
        }
        
        int arr2[]=new int[a];
         for(int i=a-1;i>=0;i--){
        
          arr2[p]=arr[i];
          p++;
         }
         for(int i=0;i<a;i++){
            //  System.out.println(arr2[i]);
        }
         int sum=0;
         long mul=1;
         for(int i=0;i<a;i++){
             if(i%2==0)
             mul=mul*arr2[i];
             if(i%2!=0)
             sum=sum+arr2[i];
         }
         System.out.print(sum +" "+mul);
    }
}
