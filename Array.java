import java.util.*;

public class Array{
  public static void main(String arg[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = s.nextInt();
 
    int x[] = new int[n];
    for( int i = 0; i<n; i++){
      System.out.print("Enter integer "+i+": ");
      x[i] = s.nextInt();
    }
  
    for(int i=0;i<x.length;i++){
      System.out.print(x[i]+" ");
    } 
  }
}
