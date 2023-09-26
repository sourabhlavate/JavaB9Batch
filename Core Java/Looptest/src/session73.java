import java.util.Scanner;
public class session73 {
 public static void main(String[] args) {
	System.out.println("java Code for loop statement:");
	Scanner sc = new Scanner(System.in);
	int base = sc.nextInt();
	int power = sc.nextInt();
	session73 obj = new session73();
	obj.print(base,power);
	
}
 void print(int base,int power) {
	 int res=1;
	 for(int i=1;i<=power;i++ ) {
		res = res*base;
				
	 }
	 System.out.println("result is"+res);
 }
}
