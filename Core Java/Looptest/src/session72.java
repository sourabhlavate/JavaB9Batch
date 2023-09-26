import java.util.Scanner;

public class session72 {
 public static void main(String[] args) {
	System.out.println("java code for psuedo question:");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a positive integer:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	session72 obj = new session72();
	obj.print(a);
	obj.print1(b);
	
}
 void print(int a){
	 
	 System.out.println("the multiplication table of entered integer is:");
	 for(int i=1;i<=10;i++) {
	 System.out.println(+a+"*"+i+"="+a*i);
	 }
	 
	 }
 void print1(int b) {
	 int res=1;
	 for(int j=1;j<=b;j++) {
		  res*=j;
		 
	 }
	 System.out.println(+res);
 }
 }

