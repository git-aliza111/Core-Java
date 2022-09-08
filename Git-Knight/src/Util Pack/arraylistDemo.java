package utilPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class arraylistDemo {

	public static void main(String[] args) {
		
		int i[]= {10,20,30,40};
		
	//	ArrayList list=new ArrayList();
	//	LinkedList<Integer> list=new LinkedList<>();
		
		Vector<Integer> list=new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list.size());
		
		for(Object n:list) {
			System.out.print("["+n+"]"+"-");
		}
		System.out.println();
		for(int n=0;n<list.size();n++) {
			System.out.print(list.get(n)+" ");
		}
		System.out.println();
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		ListIterator listiter=list.listIterator();
		while(listiter.hasNext()) {
			System.out.print(listiter.next()+" ");
		}
		System.out.println();
		while(listiter.hasPrevious()) {
			System.out.print(listiter.previous()+" ");
		}
		System.out.println();
		System.out.println(".......................................");
		
		Enumeration<Integer> e=list.elements();
		list.add(2, 500);
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement());
			System.out.println();
		}
		
		Collections.sort(list);
		System.out.println(list);
		Collections.synchronizedCollection(list);
		
		Collections.sort(list,(n1,n2)->{return n2.compareTo(n1);});    //lambdaaaa
		System.out.println(list);
		
		System.out.println("Comparator wayyy......");
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.compareTo(o1);
	}
}
