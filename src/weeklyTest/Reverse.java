package weeklyTest;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scanner.nextLine();
		String p="";
		for(int i=s.length()-1;i>=0;i--) {
			p+=s.charAt(i);
		}
		System.out.println("The reversed string is "+p);
	}
}
