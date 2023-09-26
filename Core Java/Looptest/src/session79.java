
public class session79 {
 
	public static void main(String[] args) {
		
		System.out.println("java code for psuedo codes:");
		
		
		session79 obj = new session79();
		obj.print();
	
}
	void print() {
		int sum=0;
		for(int i=1;i<=10;i++) {
		  sum= sum+i;
		  //sum+=i;
		  
		}
		System.out.println("The sum of first 10 natural numbers is:");
		System.out.println(+sum);
	}
}
