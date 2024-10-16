package strings;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		PrintSubstrings(s);
	}

	private static void PrintSubstrings(String s) {
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
				System.out.println(w);
			}			
		}
	}

}
