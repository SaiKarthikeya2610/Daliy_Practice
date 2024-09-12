package Arrays;

import java.util.Scanner;

public class ZeroFirstThenLater {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.print(ar[i]+" ");
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}

}
