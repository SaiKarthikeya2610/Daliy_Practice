package emplyobality;

import java.util.Scanner;

public class LongetAlphabeticalSubstring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		Stri(s);

	}

	public static void Stri(String s) {
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i+1)-s.charAt(i)==1)
			{
				System.out.println(s.charAt(i));
			}
			else {
				return;
			}
		}
		
	}

	public static void LongetAlpha(String s) {
		for(int size=1;size<=s.length();size++)
		{
			for(int i=0;i<=s.length()-size;i++)
			{
				String m="";
				for(int j=i;j<i+size;j++)
				{
					m=m+s.charAt(j);
				}
				if(isPalindrome(m))
				{
					System.out.println(m);
				}
			}
			
		}
		
	}
	public static void LongetPAlpha(String s) {
		for(int size=s.length();size>0;size--)
		{
			for(int i=0;i<=s.length()-size;i++)
			{
				String m="";
				for(int j=i;j<i+size;j++)
				{
					m=m+s.charAt(j);
				}
				if(isPalindrome(m))
				{
					System.out.println(m);
					return;
				}
			}
			
		}
		
	}

	private static boolean isPalindrome(String m) {
		int i=0,j=m.length()-1;
		while(i<j)
		{
			if(m.charAt(i)!=m.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}		
		return true;
	}

}
