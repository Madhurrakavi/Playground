import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code hereScanner
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int mul=1;
      for(int i=1;i<=num;i++)
      {
        mul=mul*i;
	  }
      System.out.println(mul);
    }
}