import java.util.*;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner (System.in);
      int n = s.nextInt();
      Prime(n);
      
	}
  public static void Prime(int n)
  {int i,j;
    for( i=2;i<=n;i++)
    {
      int count=0;
      for( j=1;j<=i;j++)
      {
        if(i%j==0)
        {
       count++;
       
        }
       
      }
      if(count==2)
      {
        System.out.println(i);
      }
    }
    
  }
}