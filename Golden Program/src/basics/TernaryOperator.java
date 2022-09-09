package basics;

public class TernaryOperator {

	public static void main(String[] args) {
     int age=20;
     String s=(age>=18)?"elegible":"not eligible";
     System.out.println(s);
     
     String s2=(!(age>=18))?"elegible":"not eligible";
     System.out.println(s2);
     
	}

}
