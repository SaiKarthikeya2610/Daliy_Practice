package explainationExam;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintUnpairedElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int count=1;
		Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<ar.length;i++) {
			Integer c = map.getOrDefault(ar[i], 0);
			map.put(ar[i], c+1);
		}
		Set<java.util.Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		for(java.util.Map.Entry<Integer, Integer> ks:entrySet) {
			if(ks.getValue()%2!=0)
			{
				System.out.print(ks.getKey()+" ");
			}
		}
		
	}
}
