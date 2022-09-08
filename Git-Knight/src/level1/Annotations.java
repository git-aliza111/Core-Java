package level1;

import java.lang.reflect.Field;

public class Annotations {

	public static void main(String[] args) throws Exception{
		ShoeShop shop=PuneContainer.getShoeShop();
		System.out.println(shop.Sellshoe());

	}

}

class PuneContainer{
	public static ShoeShop getShoeShop() throws Exception{
	//	ShoeFactory factory=new LakhaniShoeFactory();
		ShoeShop shop=new SiriusShoeShop();
		
		Class c=shop.getClass();
		Field field=c.getSuperclass().getDeclaredField("factory");
		field.setAccessible(true);
		In in=field.getAnnotation(In.class);
		
		if(in!=null) {
			String factoryname=in.factoryname();
            ShoeFactory factory=(ShoeFactory)
					Class.forName(factoryname).getConstructor().newInstance();
			shop.setFactory(factory);
		}
		else {
			
		}
		
	//	shop.setFactory(factory);
		return shop;
	}
}
abstract class Shoe{
	
}

class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

interface Manufacturer{
	public Shoe Makeshoe();
}

abstract class ShoeFactory implements Manufacturer{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
}

interface Seller{
	public Shoe Sellshoe();
}

abstract class ShoeShop implements Seller{
	@In(factoryname="level1.BataShoeFactory")
	private ShoeFactory factory;

	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}

class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe Makeshoe() {
		return new LeatherShoe();
		
	}
}

class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe Makeshoe() {
		return new SportsShoe();
	}
}

class SiriusShoeShop extends ShoeShop{
	public SiriusShoeShop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe Sellshoe() {
		return getFactory().Makeshoe();
	}
}