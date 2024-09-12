package strings;

import java.util.Scanner;

public class palindromeString {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int size=scan.nextInt();
		PalindromeSubstring(s,size);
	}

	private static void PalindromeSubstring(String s,int size) {

		for(int i=0;i<=s.length()-size;i++)
		{
			String w="";
			for(int j=i;j<i+size;j++)
			{
				w=w+s.charAt(j);
			}
			if(!isPalidrome(w))
			{
				System.out.println(w);
			}
		}
	}

	private static boolean isPalidrome(String w) {
		// TODO Auto-generated method stub
		int i=0,j=w.length()-1;
		while(i<j)
		{
			if(w.charAt(i)!=w.charAt(j))
			{
				return false;
			}
			i++;
			j--;
					
		}
		return true;
	}


}
