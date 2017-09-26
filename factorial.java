import java.util.*;

public class factorial {
	
	public static void main(String args[])
	{
	
	int number,i,fact=1;
	Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number");
		number = s.nextInt();
		
		for(i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		
	System.out.print("Factorial of entered number is"+fact);
	
	}
	
}