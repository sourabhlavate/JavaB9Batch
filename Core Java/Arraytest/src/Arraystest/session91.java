package Arraystest;

public class session91 {
 public static void main(String[] args) {
	int[] marks= {96,78,86,77,82,93,74,89,70,79};
	session91 obj = new session91();
	obj.printarray(marks);
	
	}
	void printarray(int[] arr) {
for ( int i=0;i<arr.length;i+=2) {
	
	System.out.println("the alternate elements of given array is :");
	System.out.println(arr[i]);
}
}}
