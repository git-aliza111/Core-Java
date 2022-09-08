package methods;

public class ArrayVariableDemo {

	public static void main(String[] args) {
		ArrayVariableDemo av=new ArrayVariableDemo();
		int arr[]= {14,52,51,75,125};
		
	//	System.out.println("before passing:"+arr[2]);
	//	av.pbrArray(arr);   //By default the arrays are pass by reference
	//	System.out.println("after passing:"+arr[2]);
		
		//1st solution
		av.pbrArray(new int[] {14,551,72,48});   //anonymous array--non reusable
		
		//2nd solution --create a copy and send
		int copyarr[]=new int[4];
		System.arraycopy(arr, 0, copyarr, 0, 4);
		System.out.println("copy arr.....:"+copyarr[2]);
		
		System.out.println("before passing:"+arr[2]);
		av.pbrArray(copyarr);
		System.out.println("after passing:"+arr[2]);
		
		System.out.println("copy arr.....:"+copyarr[2]);
	}

	void pbrArray(int a[]) {
		a[2]=515151;
	}
}
