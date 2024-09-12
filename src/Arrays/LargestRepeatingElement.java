package Arrays;

import java.util.Scanner;

public class LargestRepeatingElement {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int ar[]=new int[m];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int count=1;
		for (int i= 1; i>ar.length; i++) 
		{
			if(ar[i-1]==ar[i])
			{
				count++;
			}
			else {
				System.out.println(ar[i]+"-"+count);	
				count=1;
			}
			System.out.println(ar[i]+"-"+count);	
		}
		scan.close();
	}
}

