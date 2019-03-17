import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your mobile number");
		long mobileno = sc.nextLong();
		System.out.println("Enter your cgpa");
		double cgpa = sc.nextDouble();
		
		System.out.println("Name "+ name);
		System.out.println("Gender "+ gender);
		System.out.println("Age "+ age);
		System.out.println("Mobile number "+ mobileno);
		System.out.println("CGPA "+ cgpa);
		
	}
	
}
