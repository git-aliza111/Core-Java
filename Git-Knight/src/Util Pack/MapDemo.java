package utilPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	//	HashMap<Integer,String> hm=new HashMap<Integer, String>();
	//	TreeMap<Integer,String> hm=new TreeMap<Integer, String>();
		TreeMap<Integer,String> hm=new TreeMap<Integer, String>((s1,s2)->{return s2.compareTo(s1);});
		hm.put(1000,"aliza");
		hm.put(200,"aluuu");
		hm.put(355,"alizaaaa");
		hm.put(500,"shaikhhh");
		
	    System.out.println(hm);
	    
	    System.out.println(hm.get(355));
	    
	    ////////////////////////////////////////////////////////////////////////////
	    
	    Set<Map.Entry<Integer,String>> set=hm.entrySet();
	    Iterator<Map.Entry<Integer,String>> iter=set.iterator();
	    while(iter.hasNext()) {
	    	Map.Entry<Integer, String> me=iter.next();
	    	System.out.println(me.getKey()+":"+me.getValue());
	    }
	    

	}

}
