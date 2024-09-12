package Arrays;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int ar1[]=new int[n];
		for (int i = 0; i < ar1.length; i++)
		{
			ar1[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int ar2[]=new int[m];
		for (int j = 0; j < ar2.length; j++) {
			ar2[j]=scan.nextInt();			
		}
		int arr[]=MergeOfArrays(ar1,ar2);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] MergeOfArrays(int[] ar1, int[] ar2) 
	{
		int [] res =new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while (i<ar1.length && j<ar2.length)
		{
			if(ar2[j]<ar1[i])
			{
				res[k]=ar2[j];
				k++;
				j++;
			}
			else
			{
				res[k]=ar1[i];
				k++;
				i++;
			}
		}
		while(j<ar2.length)
		{
			res[k]=ar2[j];
			k++;
			j++;
		}
		while(i<ar1.length)
		{
			res[k]=ar1[i];
			k++;
			i++;
		}
		return res;
	}
	

}
