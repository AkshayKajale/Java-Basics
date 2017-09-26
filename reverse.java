import java.util.*;
import java.lang.*;
import java.io.*;

public class reverse {
	
	Scanner sc = new Scanner(System.in);
	String s = new String();
	  void accept()
	{
		System.out.println("Enter the string which you want to reverse");
		s = sc.nextLine();
		System.out.println(s);
		 
		char[] rever = s.toCharArray();
		
		for(int i=rever.length-1;i>=0;i--)
		{
			System.out.print(rever[i]);
		}
	}
	
	public static void main(String[] args)
	{
		reverse rev = new reverse();
		rev.accept();
		//rev.reve();
	}

}
