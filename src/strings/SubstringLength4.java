package strings;
import java.util.Scanner;
public class SubstringLength4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int size=scan.nextInt();
		Substring(s,size);
	}

	private static void Substring(String s, int size) {
		for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				t=t+s.charAt(j);
			}
			System.out.println(t);
		}
		
	}

}
