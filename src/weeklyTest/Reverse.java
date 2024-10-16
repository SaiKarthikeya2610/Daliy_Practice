package weeklyTest;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		String p="";
		for(int i=s.length()-1;i>=0;i--) {
			p+=s.charAt(i);
		}
		
		System.out.println("The reversed String is"+" "+p);
	}
}
