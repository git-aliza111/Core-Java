package basics;

public class ArraysDoubleDimen {

	public static void main(String[] args) {
    int [][]arr= {
    		{4,51,521,74},
    		{534,85,92,22},
    		{71,97,44,62}
           };
         System.out.println(arr[0][1]);
    arr[0][2]=999;
    System.out.println(arr[0][2]);
    
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.print(arr[i][j]+"\t");
    	}
    	System.out.println();
    }
    
    for(int n[]:arr)
    {
    	for(int m:n)
    	{
    		System.out.print(m+"\t");
    	}
    	System.out.println();
      }     
	}

}
