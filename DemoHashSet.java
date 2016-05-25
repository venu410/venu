package org.cap.demo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		//Collection<String> lst=new HashSet<String>();
		
		//Set<String> lst=new HashSet<String>();
		
		//HashSet<String> lst=new HashSet<String>();
		//LinkedHashSet<String> lst=new LinkedHashSet<String>();
		TreeSet<String> lst=new TreeSet<String>();
		lst.add("Tom");
		lst.add("jack");
		lst.add("jack");
		lst.add("Annie");
		lst.add("jerry");
		/*lst.add(null);
		lst.add(null);*/
		lst.add("null");
		lst.add("sam");
		lst.add("Tom");
		lst.add("anu");
		lst.add("sam");
		lst.add("sam");
		
		System.out.println(lst);
		
		
		
		
		/*for(String s:lst)
			System.out.println(s);
		
		
		Iterator<String> it=lst.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		*/

	}

}
