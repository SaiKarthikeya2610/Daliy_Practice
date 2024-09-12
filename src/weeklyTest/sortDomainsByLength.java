package weeklyTest;
//www.google.com,www.tap.com,www.instagram.com
import java.util.Scanner;

public class sortDomainsByLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
//		String ar2[];
		String ar1[]=s.split(",");
		
		for(int i=0;i<ar1.length;i++)
		{
			String ar2[]=ar1[i].split(".");
			for(int j=0;j<ar2.length;j++)
			{
				System.out.println(ar2[j]);
			}
		}

	}

}
