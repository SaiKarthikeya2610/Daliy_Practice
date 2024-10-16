package emplyobality;

import java.util.Scanner;

public class DecodeBinaryString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String al[]=s.split("0");
		int i=0;
		while(i<al.length)
//		for(int i=0;i<al.length;i++)
		{
			if(al[i].length()!=0)
			{
				int le=al[i].length();
				
				if(le+96>='A' && le<='Z') {
					System.out.println((char)(le+64));
					i++;
				}
			}
			else {
				i++;
			}
			
			
		}
	}

}
