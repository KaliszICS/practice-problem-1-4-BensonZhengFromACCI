import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
	Scanner input = new Scanner(System.in);
	System.out.print("What is your name: ");
	String name = input.nextLine();
	System.out.println(name);
	input.close();
	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a whole number: ");
	int num = input.nextInt();
	System.out.println(num * 2 + 2);
	input.close();
	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a radius: ");
	double num = input.nextDouble();
	System.out.println(2 * 3.14 * num);
	System.out.println(3.14 * num * num);
	input.close();
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a first name: ");
	String name1 = input.nextLine();
	System.out.print("Input a last name: ");
	String name2 = input.nextLine();
	System.out.print("Input an age: ");
	int age = input.nextInt();
	System.out.println(name2 + ", " + name1 + " - " + age);
	input.close();
	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a name: ");
	String name1 = input.nextLine();
	System.out.print("Input an age: ");
	int age1 = input.nextInt();
	int iq = age1;
	int age = age1 + 3;
	System.out.println(name1 + age);
	System.out.println(iq);
	input.close();
	}

}
