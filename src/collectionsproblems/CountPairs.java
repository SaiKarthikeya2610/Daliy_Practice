package collectionsproblems;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountPairs {
	private static void CountingPairs(int[] arr) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				Integer c = map.get(arr[i]);
				map.put(arr[i], c+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
//		System.out.println(map);
		Collection<Integer> values = map.values();
		int sum=0;
	for (Integer integer : values) {
		sum=sum+integer/2;
	}
	System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		CountingPairs(arr);
		
	}


}
