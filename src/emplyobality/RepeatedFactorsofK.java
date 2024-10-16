package emplyobality;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedFactorsofK {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		repeatedn(ar,k);
	}

	public static void repeatedn(int[] ar, int k) {
		Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				Integer c = map.get(ar[i]);
				map.put(ar[i],c+1);
			}
			else {
				map.put(ar[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> entries:map.entrySet())
		{
			if(entries.getValue()>1) {
				if(k%entries.getKey()==0)
				{
					System.out.println(entries.getKey());
				}
			}			
		}
		
	}

}
