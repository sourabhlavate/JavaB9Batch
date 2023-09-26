import java.util.Scanner;

public class great {
	
	public static void main(String[] args) {
		
		System.out.println("Printting the greatest number:");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value:");
		int val = sc.nextInt();
		System.out.println("Enter the second value");
		int val1 = sc.nextInt();
		System.out.println("Enter the third value");
		int val2 = sc.nextInt();
		
		great obj = new great();
		obj.greatnum (val,val1,val2);
		
	}
	void greatnum(int val,int val1,int val2) {
		
		if(val>val1 && val>val2) {
			
			System.out.println("this is great number:"+val);
			
		}
		
		 else if (val1>val && val1>val2) {
		System.out.println("This is great number:"+val1);	
		}
		
		 else {
			 System.out.println("This is greatest number:"+val2);
		 }
	}

}
