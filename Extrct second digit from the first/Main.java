


import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      
      int num = s.nextInt();
      int count = 0;
      int temp = num;
      while(temp != 0)
      {
         count = count + 1;
          temp = temp/10;
      }
      while(count-2 != 0)
      {   
           num = num/10;
        count =count - 1;
      }
      num = num%10;
      System.out.println(num);
      
	}
}
