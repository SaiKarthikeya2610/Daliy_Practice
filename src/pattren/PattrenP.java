package pattren;

import java.util.Scanner;

public class PattrenP {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
//			System.out.print("*");
			for(int j=1;j<=n;j++)
			{
				if(i%2==1 && i!=n) {
					System.out.print("*");
				}
				if(j==n)
				{
					System.out.print("*");
				}
//				else {
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}
	}
}
