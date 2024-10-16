package emplyobality;

import java.util.Scanner;

public class BalancedSubarrayLength {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		BalncedSub(ar);
	}
	

	public static void Lengths(int[] ar) {
		for(int size=ar.length;size>=0;size--)
		{
			for(int i=0;i<=ar.length-size;i++)
			{
				int sum=0;
				for(int j=i;j<i+size;j++)
				{
					sum=sum+ar[j];
				}
				if(sum==0)
				{
					System.out.println(size);
					return;
				}else {
					sum=0;
				}
				
			}
		}
		
	}
	public static void BalncedSub(int[] ar) {
		for(int size=ar.length;size>=0;size--)
		{
			for(int i=0;i<=ar.length-size;i++)
			{
				int c=0,k=0;
				for(int j=i;j<i+size;j++)
				{
					if(ar[j]>=0)
					{
						c++;
					}
					else if(ar[j]<0)
					{
						k++;
					}
				}
				if(c==k)
				{
					System.out.print(c+k);
					return;
				}
				
			}
		}
		
	}

}
