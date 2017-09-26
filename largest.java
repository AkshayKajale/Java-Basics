public class largest
{
	public static void print2largest(int arr[],int arr_size)
	{
		int i,first,second;
		
		if(arr_size<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		first = second = Integer.MIN_VALUE;
		
		for(i=0;i<arr_size;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
		
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second = arr[i];
			}
			
			
		}
		
		if(second == Integer.MIN_VALUE)
		{
			System.out.print("There is no largest element\n");
		}
		
			System.out.print("Second largest element\t"+second);
	}
	
	public static void main(String[]args)
	{
		int arr[] = {12,45,01,67,89,23,10,34};
		int n = arr.length;
		print2largest(arr,n);
	}
	
}