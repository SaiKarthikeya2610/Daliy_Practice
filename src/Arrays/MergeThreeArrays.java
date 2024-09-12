package Arrays;

import java.util.Scanner;

public class MergeThreeArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar1[]=new int[n];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int ar2[]=new int[m];
		for (int j = 0; j < ar2.length; j++) {
			ar2[j]=scan.nextInt();
		}
		int o=scan.nextInt();
		int ar3[]=new int [o];
		for (int k = 0; k < ar3.length; k++) {
			ar3[k]=scan.nextInt();
		}
		int result[]=MergeThreeArrays(ar1,ar2,ar3);
		for (int p = 0; p < result.length; p++) {
			System.out.print(result[p]+" ");
		}
	}

	public static int[] MergeThreeArrays(int[] ar1, int[] ar2, int[] ar3) {
		int res[]=new int[ar1.length+ar2.length+ar3.length];
		int i=0,j=0,l=0,k=0;
		while(i<ar1.length && j<ar2.length && k<ar3.length)
		{
			res[l]=ar1[i];
			l++;
			res[l]=ar2[j];
			l++;
			res[l]=ar3[k];
			l++;
			i++;
			j++;
			k++;
		}
		while(j<ar2.length && k<ar3.length)
		{
			res[l]=ar2[j];
			l++;
			res[l]=ar3[k];
			l++;
			j++;
			k++;
		}
		while(k<ar3.length)
		{
			res[l]=ar3[k];
			l++;
			k++;
		}
		return res;
	}

}
