package ExampleMethods;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class IntegerMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int a=Integer.MAX_VALUE;
//		System.out.println(a);
//		
//		
//		String s=scan.nextLine();
//		s.toLowerCase();
//		System.out.println();
//		Character c='a';
		
		LinkedHashMap<Integer,Integer>k=new LinkedHashMap<Integer, Integer>();
		k.put(1, 3);
		k.put(10,1);
		k.put(2, 4);
		k.put(5, 1);
		k.getOrDefault(k, null);
	
		Set<Integer> keySet = k.keySet();
		for (Integer integer : keySet) {
			
		}
		
		Set<Entry<Integer, Integer>> entrySet = k.entrySet();
		int count=0;
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println( entry.getValue());	
			System.out.println(entry.getKey());
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
