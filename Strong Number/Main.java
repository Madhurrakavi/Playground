import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int temp=n;
      int rem,sum=0,mul=1;
      while(temp!=0)
      {
        rem=temp%10;
        mul=1;
        for(int i=1;i<=rem;i++)
        {
          mul=mul*i;
        }
        sum=sum+mul;
        temp=temp/10;
      }
      if(n==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    
      
        
	}
}