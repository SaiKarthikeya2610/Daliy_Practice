package strings;

import java.util.Scanner;

public class LargestWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String main=scan.nextLine();
		String ar[]=main.split(" ");
		String Largest=ar[0];
		for (String string : ar) {
			if(string.length()>Largest.length()) {
				Largest=string;
			}
		}
		System.out.println(Largest);
	}

}
