import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int count = 1;
      while(count <= num)
      {
        System.out.println("I am a Java Developer");
        count=count+1;
      }
	}
}