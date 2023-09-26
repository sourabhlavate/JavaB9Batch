import java.util.Scanner;
public class session62 {
 
	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yout marks in Physics:");
		int m1 = sc.nextInt();
		System.out.println("Enter yout marks in Chemistry:");
		int m2 = sc.nextInt();
		System.out.println("Enter yout marks in Mathematics:");
		int m3 = sc.nextInt();
		float avg = (m1+m2+m3)/3.0f;
		System.out.println(avg);
		
		session62 obj = new session62();
		obj.print(m1,m2,m3,avg);
}
	void print(int m1,int m2,int m3,float avg) {
		if(m1>=33 && avg>=40) {
			System.out.println("congratulation,you are passed in physics:");
			
		}
		else {
			System.out.println("sorry,you are failedin physics:");
		}
		 if (m2>=33 && avg>=40) {
			System.out.println("congratulation,you are passed Chemistry:");
			
		}
		 else {
				System.out.println("sorry,you are failed in chemistry:");
			}
		 if (m3>=33 && avg>=40) {
			System.out.println("congratulation,you are passed Mathematics:");
		}
		 else {
				System.out.println("sorry,you are failed in mathematics:");
			}
		
	}
}
