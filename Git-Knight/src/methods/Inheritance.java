package methods;

public class Inheritance {

	public static void main(String[] args) {
	BadBrush bb=new BadBrush();
	bb.Paint(2);

	GoodBrush1 GB=new GoodBrush1();
	GB.Paint(new RedPaint());
	GB.Paint(new BluePaint());
	
	GoodBrushTrue GBT=new GoodBrushTrue();
	GBT.Paint(new RedPaint());
	GBT.Paint(new BluePaint());
	}

}

class BadBrush{
	public void Paint(int i) {
		if(i==1) {
			System.out.println("red color");
		}
		else if(i==2) {
			System.out.println("green colour");
		}
	}
}

/*
1. Remove the conditions.
2. Convert the condition to classes
3. INHERITANCE - GROUP THE CONDITIONS UNDER A COMMON CLASS
4. create a relationship between the using class and condition class
*/


class GoodBrush1{    //Bad Brush 2
public void Paint(RedPaint rp) {
	System.out.println(rp);
   }
public void Paint(BluePaint bp) {
	System.out.println(bp);
    }
 }

class Paint{
	
 }
class RedPaint extends Paint{
	
 }
class BluePaint extends Paint{
	
 }

//this code is closed for modification but open for extension
class GoodBrushTrue{    
public void Paint(Paint rp) {
	System.out.println(rp);
    }
 }
