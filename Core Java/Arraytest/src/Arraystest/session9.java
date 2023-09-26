package Arraystest;

import java.lang.reflect.Array;

public class session9 {
	
	public static void main(String[] args) {
		
		int[] rnoarr = new int[10];
		   rnoarr[0] = 1;
		   rnoarr[1] = 2;
		   rnoarr[2] = 3;
		   rnoarr[3] = 4;
		   rnoarr[4] = 5;
		   
		   session9 obj = new session9();
		   obj.printarray(rnoarr);
		   float [] arr=obj.returnarray();
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		  }
 void printarray(int[] arr) {
	for (int i=0;i<arr.length;i++)
		   System.out.println(arr[i]);
 }
 float[] returnarray(){
	 float[] farray = new float[5];
	 farray[0]=10.0f;
	 farray[1]=20.0f;
	 return farray;
 }
}
