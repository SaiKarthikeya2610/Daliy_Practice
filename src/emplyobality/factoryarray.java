package emplyobality;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class factoryarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		factoritem(ar,k);
	}

	public static void factoritem(int[] ar, int k) {

		//		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		int d=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				if(k%ar[i]==0)
				{
					d++;
					System.out.print(ar[i]+" ");
				}
			}

		}
		if(d==0)
			System.out.print("None");


	}
}