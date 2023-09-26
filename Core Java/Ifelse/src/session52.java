import java.util.Scanner;
public class session52 {
 
	public static void main(String[] args) {
	 
		System.out.println("java programme");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		System.out.println("Enter the fourth number:");
		int d = sc.nextInt();
		
		session52 obj = new session52();
		obj.print(a,b,c,d);
		}
	void print(int a,int b,int c,int d) {
		
		if(a>b && a>c && a>d) {
			System.out.println(+a+" is greater than "+b+" "+c+" "+d);
		}
		else if (b>a && b>c && b>d){
			System.out.println(+b+" is greater than "+a+" "+c+" "+d);
		}
		else if (c>a && c>b && c>d){
			System.out.println(+c+" is greater than "+a+" "+b+" "+d);
		}
		else if (d>a && d>c && d>b){
			System.out.println(+d+" is greater than "+a+" "+b+" "+c);
		}
		
	}
}
