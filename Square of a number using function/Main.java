import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int squr;
    squr = n*n;
    return squr;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      System.out.println(square(n));
	} 
}