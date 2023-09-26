import java.util.Scanner;
public class session63 {
  
	public static void main(String[] args) {
	System.out.println("java code to find whether a year is leap or not:");
	System.out.println("Enter a year:");
	Scanner sc = new Scanner(System.in);
	 int year = sc.nextInt();
	session63 obj = new session63();
	obj.print(year);
}
	void print(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					
				}
			}
		
		System.out.println("The entered year is leap year");}
			
		else {
			System.out.println("The entered year is not leap year:");
		}
		}
	}

