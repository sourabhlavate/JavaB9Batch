import java.util.Scanner;

public class statement {
	
public static void main(String[] args) {
		
		System.out.println("Hello if else stetement:"
				+ " Checking eligibility of your vitting:");
		System.out.println("Enter your age:");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		statement p = new statement();
		p.checkingage(age);
		
	}
	
	void checkingage(int age) {
		
		if (age<18) {
			
			System.out.println("you are not elegible for vote:");
		}
		
		else if(age==18) {
			
			System.out.println("You can apply dor voter card:");
		}
		else {
			System.out.println("You are elegible for votting");
		}
		}
	}




