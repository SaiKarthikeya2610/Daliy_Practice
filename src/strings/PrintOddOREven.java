
package strings;

import java.util.Scanner;

public class PrintOddOREven {

	public static void main(String[] args) {
		// TODO Auto-gene
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		String ar[]=n.split(" ");
		for(int i=1;i<=ar.length;i+=2)
		{
			
				
				System.out.print(ar[i]+" "+ar[i-1]+" ");
				
			
		}
	}

}
