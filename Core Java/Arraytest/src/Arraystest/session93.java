package Arraystest;

public class session93 {
	
	void printarray(int[] arr) {
	
		
	int min=arr[0];
	int max = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			
			min=arr[i];
		}
		if (arr[i]>max) {
			
			max = arr[i];
		}
	}
	System.out.println("the minimum element of given array is:");
	System.out.println(min);
	System.out.println("the maximum element of given array is:");
	System.out.println(max);}
	
public static void main(String[] args) {
	int[] marks= {96,78,86,77,82,93,74,89,70,79};
	
	session93 obj = new session93();
	obj.printarray(marks);
}
}