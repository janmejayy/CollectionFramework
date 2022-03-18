package ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class AddArraytoAL {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();//how many times i want to run the test cases
	while(t-- >0)// 
	{
		int n=sc.nextInt();//for size of array
		int arr[]=new int[n];
		for(int i=0; i<n;i++) {
			int x=sc.nextInt();//giving input element
			arr[i]=x;
		}
		ArrayList<Integer>ans=fillArrayList(arr,n);
		for(int x:ans) {
			System.out.print(x+" ");
			//System.out.println();
		}
	}
}

private static ArrayList<Integer> fillArrayList(int[] arr, int n) {
	 ArrayList<Integer>a=new ArrayList<Integer>();
	    for(int i=0;i<n;i++){
	        a.add(arr[i]);
	        
	    }return a;
}

}