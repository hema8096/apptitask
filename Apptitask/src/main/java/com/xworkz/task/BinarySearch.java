package main.java.com.xworkz.task;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,3,6,8,10,15,21,29};
		int i = 10;
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if (arr[mid] == i ) {
				System.out.println(" i want to know the output"+mid);
				return;
			}
			if (i < arr[mid])
				end = mid -1 ;
			else
				start = mid +1;
		} 
		System.out.println("key is not found");
	}


	}


