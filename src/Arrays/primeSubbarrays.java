package Arrays;

import java.util.Scanner;

public class primeSubbarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ar[] = new int[N];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int c=0;
		for (int size = 1; size <=ar.length-1; size++) {
			for (int i = 0; i <= ar.length-size; i++) {
				int sum=0;
				for (int j = i; j <i+size; j++) {
					sum+=ar[j];
				}
				if(isPrime(sum))
				{
					for (int j = i; j <i+size; j++) {
						System.out.print(ar[j]+" ");
						c++;
					}
					System.out.println();
				}
			}
		}
	}

	private static boolean isPrime(int sum) {
		if(sum<=1)
			return false;
		for (int i = 2; i*i <=sum ; i++) {
			if(sum%i==0)
			{
				return false;
			}
		}
		return true;
	}
	

}
