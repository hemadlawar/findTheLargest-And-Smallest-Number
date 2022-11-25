
/* 
Q\develop a program by using java programming language that inputs 10 intgers within a for loop and display largest number.
*/

import java.util.Scanner;



public class findTheLargestNumber {

	public static void main(String[] args) {
	
		largestAndsmallestNumber();
			
		}
	
	
	
	public static void largestAndsmallestNumber() {
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("write ten numbers");
		System.out.println("=======================");
		
		
		
		int [] arr=new int [10];
		for (int i = 0; i <arr.length; i++) {
			arr[i]=sc.nextInt();
		
		
		
		}
		int largest=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
				largest=arr[j];
				
			};
		}
		
		
		int smallest=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<smallest) {
				smallest=arr[j];
				
			};
		}
		
		
		
		
		
		System.out.println("the largest number is : "+largest);
		System.out.println("the smallest number is :"+ smallest);
		} catch (Exception e) {
		System.out.println("write 10 numbers please");
		}
	}

	} 


