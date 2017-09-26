import java.util.*;

public class strongnumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c=0,num,temp,a;
		System.out.println("Enter the Number\n");
		num = sc.nextInt();
		
		temp = num;
		
			while(num>0)
			{
				a = num%10;
				num = num/10;
				c = c+(a*a*a);
				
			}
			
			if(temp == c)
			{
				System.out.println(temp+ "is a ArmStrong Number");
			}
			else
			{
				System.out.println(temp+ "is not a ArmStrong Number");
			}
			
	}

}
