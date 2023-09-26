import java .util.Scanner;
public class reminder {
	
	public static void main(String[] args) {
		
		System.out.println("Java code to find quotient and remainder:");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divident:");
		int a = sc.nextInt();
		System.out.println("Enter the divisor:");
		int b = sc.nextInt();
		
		int c= a/b;
		System.out.println("this is the value of quotient:"+c);
		int d= a%b;
		System.out.println("this is the value of remainder:"+d);
		
		}
}
