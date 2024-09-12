package strings;

import java.util.Scanner;

public class VowlesInSubstring {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		
		CountSubstrings(s);
	}

	private static void CountSubstrings(String s) {
		// TODO Auto-generated method stub
		for(int size=1;size<=s.length();size++)
		{
			for(int i=0;i<=s.length()-size;i++)
			{
				String w="";
				for(int j=i;j<i+size;j++)
				{
					w=w+s.charAt(j);
				}
				if(isVowels(w)>0)
				{
					System.out.println(w);
				}
			}
		}
	}

	private static int isVowels(String w) {
		int c=0;
		for(int i=0;i<w.length();i++)
		{
			if(w.charAt(i)=='a'||w.charAt(i)=='e'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='u')
			{
				c++;
			}
		}
		return c;
	}
}
