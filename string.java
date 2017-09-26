import java.util.*;

public class string {
	
	Scanner sc = new Scanner(System.in);
	String s1,substring;
	
	
	void accept()
	{
		System.out.println("\nEnter the string");
		s1 = sc.nextLine();
		System.out.println("\nThe Entered String is  "+s1);
	}
	
	void replace()
	{
		substring = s1.substring(1, 4)+"(build "+s1.substring(5);
		System.out.println(substring);
	}
	
	
	public static void main(String args[])
	{
		string st = new string();
		st.accept();
		st.replace();
	}
	

}
