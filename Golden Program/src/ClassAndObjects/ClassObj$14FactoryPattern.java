package classesAndObjects;
/*
Factory is primarily used to create objects.
It comes under - creational Patterns
It has totally 3 patterns associated with
1. Factory 2. Abstract Factory 3. Factory Method
Difference between normal and factory method is
Factory Methods will hide its complexity and gives you the result - the methods which hide the complexity of object creation is called FACTORY METHOD
*/
public class ClassObj$14FactoryPattern {

	public static void main(String[] args) {
		ShoeShop shop=Dubai.getShoeShop();
		
		System.out.println(shop.SellShoe());
	}

}

class Dubai{
public static ShoeShop getShoeShop() {
	ShoeFactory factory=new BataShoeFactory();
	ShoeShop shop=new RahimSeller();
	
	//dependency injection
	shop.setFactory(factory);
	return shop;
}
	
}

class Shoe{}
abstract class ShoeFactory{
	public abstract Shoe CreateShoe();
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe CreateShoe() {
	 return new Shoe();
	}
}

class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe CreateShoe() {
	 return new Shoe();
	}
}

abstract class ShoeShop{
	private ShoeFactory Factory;
	
	public abstract Shoe SellShoe();
	
	public ShoeFactory getFactory() {
		return Factory;
	}
	public void setFactory(ShoeFactory factory) {
		this.Factory = factory;
	}
}

class RahimSeller extends ShoeShop{
	@Override
	public Shoe SellShoe() {
		// TODO Auto-generated method stub
		return null;
	}
}