import java.util.*;

public class convert {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		String decimal = sc.nextLine();
		System.out.println(Integer.parseInt(decimal,2));
	}

}
