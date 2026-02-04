import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String a = s.nextLine();
		System.out.println(a);
		
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int a = s.nextInt();
		System.out.print("In: ");
		int b = s.nextInt();
		System.out.println(a/b);
		System.out.println(a%b);
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String a = s.nextLine();
		System.out.println(a + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int a = s.nextInt();
		System.out.println(a*5);

		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean a = s.nextBoolean();
		System.out.println(a+" is a boolean");
		s.nextLine();
		
	}

	public static void q6() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double a = s.nextDouble();
		System.out.println(a - 3.2);
		s.nextLine();		
	}

}
