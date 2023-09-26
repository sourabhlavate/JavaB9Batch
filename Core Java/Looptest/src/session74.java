import java.util.Scanner;
public class session74 {
 
	public static void main(String[] args) {
		
		System.out.println("java code:");
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter a number:");
		//int a = sc.nextInt();
		session74 obj = new session74();
		obj.print();
		
	}
	void print(){
		for(int i=1;i<5;i++) {
			System.out.println("**********");
		}
		for(int j=0;j<5;j++) {
			for(int k=0;k<=j;k++) {
				System.out.print("*");
			
			
		}
			System.out.println();
	}
}}
