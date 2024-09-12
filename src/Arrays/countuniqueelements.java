package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class countuniqueelements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int count=1;
		//		int wecount=0;
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if (count==1)
				{
					//					wecount++;
					System.out.println(ar[i]);
				}
				count=1;
			}
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		if (count==1)
		{
			System.out.println(ar[n-1]);
			al.add(2);
			if (al.isEmpty());
			{
				System.out.println("empty");
			}
			
		}
	}
}
