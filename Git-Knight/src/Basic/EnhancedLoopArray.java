package Basics;

public class EnhancedLoopArray {

	public static void main(String[] args) {
		int arr[]= {31,56,82,93,16};
		for(int i:arr) {
			System.out.println(i);
		}
		
		int arr1[][]= {
				{13,44,73,19},
				{72,94,83,27},
				{17,92,46,27}
		};
		
		for(int i[]:arr1) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
