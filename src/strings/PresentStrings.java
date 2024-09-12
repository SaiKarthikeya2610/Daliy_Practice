package strings;

import java.util.Scanner;

public class PresentStrings {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		String result = PresentString(s,t);
		System.out.println(result);
		
	}

	private static String PresentString(String s, String t) {
		
		int size=t.length();
		for(int i=0;i<s.length()-size;i++)
		{
			String w="";
			for(int j=i;j<i+size;j++)
			{
				w=w+s.charAt(j);
			}
			if(w.equals(t)) {
				return "Yes";
			}
			
		}
		return "No";
		
	}

}
