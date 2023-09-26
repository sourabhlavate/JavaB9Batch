package Arraystest;

public class session103 {
	public static void main(String[] args) {
		
		int[] marks = {2,4,6,8,4,6,10,10};
		session103 obj = new session103();
		obj.printarray(marks);
			}

	 void printarray(int [] arr) {
		 System.out.println("the repeated elements of given array is:");

		 
		 for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 
				 System.out.println(arr[i]); 
	 }
	}	
		 } }}
