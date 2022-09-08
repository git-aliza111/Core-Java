package level1;

public class Generics1 {

	public static void main(String[] args) {
	PaintBrush<Paint> brush=PaintBrushContainer.getBrush();
	
	Paint paint=brush.getObj();
	
	paint.getcolor();
	
	PaintBrush<ColorWater> colorbrush=ColorWaterContainer.getBrush();
	
	ColorWater cb=colorbrush.getObj();

	cb.Holi();
	
	PaintBrush<DryAir> drybrush=DryAirContainer.getBrush();
	
	DryAir dbrush=drybrush.getObj();
	
	dbrush.clean();
	}

}

//baddest form of writing a code...
class BadPaintBrush{
public void DoPaint(int c) {
	if(c==1) {
		System.out.println("red paint");
	}
	else if(c==2){
		System.out.println("blue paint");
	}
	else {
		System.out.println("choose red or blue only");
	}
 }
}

class PaintBrushContainer{
	public static PaintBrush<Paint> getBrush() {
		PaintBrush<Paint> brush=new PaintBrush<>();
		brush.setObj(new RedPaint());
		return brush;
	}
}

class ColorWaterContainer{
	public static PaintBrush<ColorWater> getBrush() {
		PaintBrush<ColorWater> brush=new PaintBrush<>();
		brush.setObj(new ColorWater());
		return brush;
	}
}

class DryAirContainer{
	public static PaintBrush<DryAir> getBrush() {
		PaintBrush<DryAir> brush=new PaintBrush<>();
		brush.setObj(new DryAir());
		return brush;
	}
}

class PaintBrush<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
}

abstract class Paint{
	public abstract void getcolor();
}
class RedPaint extends Paint{
	@Override
	public void getcolor() {
		System.out.println("red paint...");
		
	}
}
class BluePaint extends Paint{
	@Override
	public void getcolor() {
		System.out.println("blue paint...");
		
	}
}
class GreenPaint extends Paint{
	@Override
	public void getcolor() {
	System.out.println("green color....");
		
	}
}

class ColorWater{
	public void Holi(){
		System.out.println("playing holi.....");
	}
}

class DryAir{
	public void clean(){
		System.out.println("cleaning.....");
	}
}
