package commonCode;

import java.util.Scanner;

public class Palindorme {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		boolean result = isPalindrome(s);
		System.out.println(result);
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
