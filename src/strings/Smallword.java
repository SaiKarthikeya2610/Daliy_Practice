package strings;

import java.util.Scanner;

public class Smallword {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String main=scan.nextLine();
		String ar[]=main.split(" ");
		String small=ar[0];
		for (String string : ar) {
			if(string.length()<small.length()) {
				small=string;
			}
		}
		System.out.println(small);
	}
	

}
