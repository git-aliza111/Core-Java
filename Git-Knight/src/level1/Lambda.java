package level1;

public class Lambda {

	public static void main(String[] args) {
	
		//old wayy
		Exporter e=new exporterimp();
		e.Doexport();
		
		//anonymous implementation
		Exporter exp=new Exporter() {
		@Override
		public void Doexport() {
			System.out.println("anonymous wayy....");
			
		}
	};
		exp.Doexport();	

		
		//lamda
		Exporter exp2=()->
		{
			System.out.println("do export logic written here..lambda wayyy...");
		
		};
		exp2.Doexport();
		importer imp=(s,n)->
		{
			System.out.println("importing login hrerrerer"+" "+s+":"+n);
		};
		imp.doimport("knightss", 1010101);
	}
}

@FunctionalInterface
interface Exporter{
	public void Doexport();

}
class exporterimp implements Exporter{
	@Override
	public void Doexport() {
	System.out.println("do export is implemented..old wayy");
		
	}
}
@FunctionalInterface
interface importer{
	public void doimport(String s,int n);
}

