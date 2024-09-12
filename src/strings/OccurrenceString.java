package strings;

import java.util.Scanner;

public class OccurrenceString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		int reslut = Occurrenec(s,t);
		System.out.println(reslut);
	}

	private static int Occurrenec(String s, String t) {
		
		int size=t.length();
		int c=0;
		for(int i=0;i<s.length()-size;i++)
		{
			String w="";
			for(int j=i;j<i+size;j++)
			{
				w=w+s.charAt(j);
			}
			if(w.equals(t))
			{
				c++;
			}
		}
		return c;
		
	}

}
