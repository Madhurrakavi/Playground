import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i==j || j+i==n-1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
          System.out.println();
      }
      
	}
}