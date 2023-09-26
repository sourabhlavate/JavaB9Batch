import java.util.Scanner;

public class controlstatement1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello if else stetement");
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		controlstatement1 p = new controlstatement1();
		p.checkingage(marks);
		
	}
	
	void checkingage(int marks) {
		
		if(marks<=25) {
			System.out.println("F");
		}
		 else if (marks>=26 && marks<=45){
			System.out.println("E");
		}
		 else if (marks>=47 && marks<=50){
				System.out.println("D");
			}
		 else if (marks>=51 && marks<=60){
				System.out.println("C");
			}
		 else if (marks>=61 && marks<=80){
				System.out.println("B");
			}
		 else if (marks>=81 && marks<=100){
				System.out.println("A");
			}
				
}
	
}


