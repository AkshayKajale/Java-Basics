import java.util.*;

public class addition {
	
	Scanner s = new Scanner(System.in);
	int i,temp,j,temp2,n;
	int array[] = new int[5];
	
	//Accepting The Elements//
	void accept()
	{
		//System.out.println("Enter the number of elements in the array\n");
		//n = s.nextInt();
		System.out.println("Enter the elements in the array\n");
		for(i=0;i<5;i++)
		{
			array[i] = s.nextInt(); 
		}	
		
	}
	
	//Displaying the unsorted list//
	void display()
	{
		System.out.println("Elements in the array is\n");
		for(i=0;i<5;i++)
		{
		System.out.println(array[i]);
		}
	}
	
	//Displaying the sorted list//
	void displaysorted()
	{
		System.out.println("Sorted Elements in the array is\n");
		for(i=0;i<5;i++)
		{
		System.out.println(array[i]);
		}
	}

	
	//Sorting method//
	void sort()
	{
		for(i=0;i<5;i++)
		{
			for(j=0;j<5-i-1;j++)
			{
				
			
		
			if(array[j]<array[j+1])
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				
				
			}
			temp2 = array[j] + array[j+1];
			}
		}
		System.out.println("Addition of 2 maximum numbers is "+temp2+"\n");
	}
	
	public static void main(String[] args)
	{
		addition ad = new addition();
		ad.accept();
		ad.display();
		ad.sort();
		ad.displaysorted();
	}
}