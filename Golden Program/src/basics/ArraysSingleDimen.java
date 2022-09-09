package basics;

public class ArraysSingleDimen {

	public static void main(String[] args) {
       
		//single dimensional array- 1 row and multiple column
		
		int arr[]= {13,45,27,722,65,111};  //declared + initialization
      //int []arr1=new int[6];
		int arr1[]=new int[6];    //declared array...still java will initialize it with default values
		
		System.out.println(arr[0]);
		arr[0]=1000;  //allocation
		System.out.println(arr[0]);
		
		String arr3[]=new String[6];
		arr3[0]="hello";
		System.out.println(arr3[0]);
		
		//arr.length- it will return the no. of columns in single dimensional array.
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//latest for loop- enhanced for loop introduced in jdk 5 for arrays and collections.
		//its an automatic loop,it iterates the array automatically and returns the value by value to the left hand side variable.
		
		for(int n:arr)
		{
			System.out.print(n+"\t");
		}
		System.out.println();
		
		for(String s:arr3) {
			System.out.print(s+"\t");
		}
			
	}

}
