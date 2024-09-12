package weeklyTest;

import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{				
//				if(j%2==0)
//				{
//					System.out.print(" ");
//				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
