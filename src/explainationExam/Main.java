package explainationExam;
class A {
	static int x = 10;  // Static variable x is initialized to 10
	static {
		x += 5;  // Static block adds 5 to x
	}
}

class B extends A {
	static {
		x += 10;  // Static block of B adds 10 to x
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println(B.x);  // Prints the value of x from class B
	}
}
