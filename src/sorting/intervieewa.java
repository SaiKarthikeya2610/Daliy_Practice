 package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class empl implements Comparable<empl>{
	private String detail;
	private String firstname;
	private int age;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public empl(String detail, String firstname, int age) {
		super();
		this.detail = detail;
		this.firstname = firstname;
		this.age = age;
	}
	@Override
	public String toString() {
		return detail;
	}
	@Override
	public int compareTo(empl o2) {
		empl o1=this;
 		int i=o1.getFirstname().compareTo(o2.getFirstname());
		if(i==0) {
			Integer a1=o1.getAge();
			Integer a2=o2.getAge();
			return a1.compareTo(a2);
		}
		return i;
	}
}
public class intervieewa {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s= scan.nextLine();
		
		String[] arr= s.split(" ");
		ArrayList<empl> al= new ArrayList<empl>();
		for(int i=0;i<arr.length;i++) {
			String t=arr[i];
			String[] arr2= t.split(",");
			String t1=arr2[1];
			int age=Integer.parseInt(arr2[3]);
			empl em=new empl(t, t1, age);  
			al.add(em);
		}
//		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}