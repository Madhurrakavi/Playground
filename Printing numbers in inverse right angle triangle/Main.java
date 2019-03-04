import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
            Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int temp = n;
      for (int row = 1 ; row <= n ; row++)
      {
        for(int col = n-row ; col >= 0 ; col--)
        {
          System.out.print(temp);
          temp--;
          
        }
        temp = n-row;
        System.out.println();
      }
}
}