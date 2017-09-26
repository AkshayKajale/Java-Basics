import java.util.*;


public class list {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%3 == 0)
			{
				System.out.println("Raja");
			}
			else if(i%5 == 0)
			{
				System.out.println("Softwares");
			}
				
				
		}
			
	}
	

}
