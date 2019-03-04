import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int temp=1;
      for(int i=1;i<=n;)
      {
        if(temp%2==01)
        {
          System.out.println(temp);
          i++;
        }
        temp++;
        }
	}
}