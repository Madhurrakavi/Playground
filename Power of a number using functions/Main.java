import java.util.Scanner;
class Main
{
   public static void power(int base ,int expon)
  {
    int mul=1;
    for (int i=1;i<=expon;i++)
    {
      mul=mul*base;
    }
     System.out.println(mul);
  
  }
    public static void main(String args[])
    {   
         Scanner s=new Scanner(System.in);
         int base =s.nextInt();
         int expon = s.nextInt();
      power(base,expon);
      
    }
 
}