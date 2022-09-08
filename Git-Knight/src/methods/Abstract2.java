package methods;

public class Abstract2 {

	public static void main(String[] args) {
     DominosPizza DP=new IndianDominosPizza();
     DP.makePizza();
     DP.collectpayemnt();
     DP.deliverPizza();
	}
}

abstract class DominosPizza{
	final private void makedough() {
		System.out.println("dominos secret of making dough");
	}
    final private void addingredient() {
    	System.out.println("dominos secret of adding ingredient");
	}
    final private void bakedough() {
    	 System.out.println("dominos secret of baking dough");
	}
    public void makePizza() {        //Template Methods
		System.out.println("dominos started making pizza");
    	makedough();
		addingredient();
		bakedough();
		System.out.println("pizza created as per dominos");
	}
	public abstract void deliverPizza();
	public abstract void collectpayemnt();
}

class IndianDominosPizza extends DominosPizza{
  @Override
  	public void collectpayemnt() {
  		System.out.println("collect as per ur wayyyy");
  		
  	}
  @Override
	public void deliverPizza() {
		System.out.println("deliver as per ur convinence");
		
	}

}