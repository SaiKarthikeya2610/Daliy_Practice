package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Emplyoee implements Comparable<Emplyoee> {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emplyoee(int id, String firstName, String lastName,int age , int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public Emplyoee() {
		super();
	}
	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +", age=" + age  
				+ ", salary=" + salary+ "]";
	}

	@Override
	public int compareTo(Emplyoee e2) {
		Emplyoee e1=this;
		int m=e1.getFirstName().compareTo(e2.getFirstName());
		if(m==0)
		{
			Integer p1=e1.getAge();
			Integer p2=e2.getAge();
			int p=p1.compareTo(p2);
			return p;
		}
		return m;
	}
	/*	123,Karthik,Rachamalla,25,50000
	143,Ganesh,Rachamalla,25,25000
	153,Madhavi,Rachamalla,28,50000
	153,Madhavi,Rachamalla,27,50000*/
}
public class Day3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of emplyoee");
		int n=scan.nextInt();
		ArrayList<Emplyoee> al=new ArrayList<Emplyoee>();
		for(int i=1;i<=n;i++)
		{
			Emplyoee e = new Emplyoee();
			System.out.println("Enter the"+ " " +i+" emplyoee deatils ");
			String s=scan.next();
			String ar[]=s.split(",");

			e.setId(Integer.parseInt(ar[0]));
			e.setFirstName(ar[1]);
			e.setLastName(ar[2]);
			e.setAge(Integer.parseInt(ar[3]));
			e.setSalary(Integer.parseInt(ar[4]));

			al.add(e);			
		}
//		System.out.println(al);
		Collections.sort(al);

		System.out.println(al);

	}
}
