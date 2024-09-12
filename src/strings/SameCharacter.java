package strings;
import java.util.Scanner;
public class SameCharacter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		String result = There(s,t);
		System.out.println(result);
	}


	private static String There(String s, String t) {

		int i=0,j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else {
				i++;
			}
			
		}
		return j==t.length()?"Yes":"No";

	}
}
