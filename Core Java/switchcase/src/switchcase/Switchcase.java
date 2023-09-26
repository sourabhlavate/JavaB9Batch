package switchcase;
import java.util.Scanner;

public class Switchcase {
	
	public static void main(String[] args) {
	
		System.out.println("Following is the code for checking your votting eligibility: ");
		
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		
		Switchcase obj = new Switchcase();
		obj.checking(  age);
		}
	
	void checking(int age) {
		
		switch(age) {
		case  17:
			System.out.println("you are not eligible for votting:");
		      break;
		case 18:
			System.out.println("you are eligible for applyingvoter card:");
		      break;
		  default:{
			 
			System.out.println("you are eligible for votting:");  
		  }
			  
		      
		}
		
		
			}
	}
	


