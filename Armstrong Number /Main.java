import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
        Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int count=0;
      int temp=n,sum=0,rem;
   
      while(n!=0)
      {
        rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
      }
      if(temp==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        

	}
}
