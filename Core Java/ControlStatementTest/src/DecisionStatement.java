import java.util.Scanner;

public class DecisionStatement {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Eclipse World:");
		
		DecisionStatement obj = new DecisionStatement();
		obj.add();
		
	}
	
	void add() {
		
		Scanner sc = new Scanner(System.in);
	      float subject1 = sc.nextFloat();
	      System.out.println(subject1);
	      float subject2 = sc.nextFloat();
	      System.out.println(subject2);
	      float subject3 = sc.nextFloat();
	      System.out.println(subject3);
	      float subject4 = sc.nextFloat();
	      System.out.println(subject4);
	      float subject5 = sc.nextFloat();
	      System.out.println(subject5);
	      float res = subject1+subject2+subject3+subject4+subject5;
	       res = res/500;
	      float percent = res*100;
	    	System.out.println("percentageof y is:"+percent);
	}
	
}
