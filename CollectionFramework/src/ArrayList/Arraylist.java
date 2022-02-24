package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int arr []=new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			int sum=0;
			for(int j:arr) {
				sum+=sum+arr[i];
				
			}
			System.out.println((sum));
		}
		
		    }
		  }
	

