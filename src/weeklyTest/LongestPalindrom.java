package weeklyTest;

import java.util.Scanner;

public class LongestPalindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		substr(s);
	}




	public static void substr(String s) {
		for(int size=s.length();size>=1;size--)
		{
			for(int i=0;i<s.length()-size;i++)
			{
				String t="";
				for(int j=i;j<i+size;j++)
				{
					t=t+s.charAt(j);
				}
				if(palindrome(t)) {
					System.out.println(t);
					return;
				}
			}

		}
	}

	public static boolean palindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {

				return false;
			}
			i++;
			j--;
		}
		return true;


	}
}
