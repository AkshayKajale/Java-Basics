import java.util.*;
public class tables {
	
	public static void main(String args[])
	{
		int number;
		Scanner s = new Scanner(System.in);
		{
			System.out.println("Enter the number to print table\n");
			number = s.nextInt();
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(number*i);
			}
		}
	}

}
