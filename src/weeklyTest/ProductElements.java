package weeklyTest;

import java.util.Scanner;

public class ProductElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k=1;
		for(int i=0;i<ar.length;i++)
		{
			k*=ar[i];
		}
		System.out.println(k);
	}

}
