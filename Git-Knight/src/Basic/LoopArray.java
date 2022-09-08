package Basics;

public class LoopArray {

	public static void main(String[] args) {
	int arr[]= {31,56,82,93,16};
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	int arr1[][]= {
			{13,44,73,19},
			{72,94,83,27},
			{17,92,46,27}
	};
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}
