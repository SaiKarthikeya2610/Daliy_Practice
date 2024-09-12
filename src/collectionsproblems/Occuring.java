package collectionsproblems;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Occuring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		String ar[]=s.split(" ");
		OccuringMoreThan3(ar);
	}

	private static void OccuringMoreThan3(String[] ar) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(lhm.containsKey(ar[i])) {
				Integer c = lhm.get(ar[i]);
				lhm.put(ar[i], c+1);
			}
			else {
				lhm.put(ar[i], 1);
			}
		}
		
		Set <Entry<String,Integer>> entrys =lhm.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			if(entry.getValue()>3) {
				
				System.out.println(entry.getKey());
			}
		}
	}
}
