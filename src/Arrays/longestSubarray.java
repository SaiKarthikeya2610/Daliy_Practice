package Arrays;

import java.util.Scanner;

public class longestSubarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k=scan.nextInt();
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		longestSubarray(ar,k);
	}
	
	private static void longestSubarray(int[] ar, int k) {
		
		int c=0;
		for (int size = ar.length; size>=1; size--){
			for (int i = 0; i <= ar.length-size; i++) {
				int sum=0;
				for (int j = i; j <i+size; j++) {
					sum+=ar[j];				
					
				}
				if(sum == k) {
					for (int j = i; j <i+size; j++) {
						c++;
						System.out.print(ar[j]+" ");
					}
					return;
				}
				
			}
			
		}
		if(c==0)
		{
			System.out.println("No subarray found.");
		}
	}

}
