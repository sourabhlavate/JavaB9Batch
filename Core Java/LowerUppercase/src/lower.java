import java.util.Scanner;
public class lower {
public static void main(String[] args) {
	System.out.println("java code to find whether a number is positive or negative:");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int a = sc.nextInt();
		lower obj = new lower();
		obj.value(a);
		
}
void value(int a) {
	
	if(a%2==0) {
		System.out.println("the number is positive.");
	}
	else {
		
		System.out.println("the number is negative.");
	}
}
}
