package Arraystest;

public class session102 {
	
	public static void main(String[] args) {
		
		int[] marks = {96,78,86,77,82,93,74,89,70,79};
		
		session102 obj = new session102();
		obj.printarray(marks);
		
		
		}
	void printarray(int[] arr) {
		
	for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		
		System.out.println("the given numbers are positive:"+arr[i]);
	}
	else {
		System.out.println("the given numbers are negative:"+arr[i]);
	}

}}}
