package packmaven;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrograms {
	
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Devika");
		al.add("Divya");
		al.add("Ammu");
		al.add("Jaya");
		System.out.println(al);
		
		String a=al.get(2);
		System.out.println(a);
		
		Boolean b=al.contains("Divya");
		System.out.println(b);
		int c=al.size();
		System.out.println(c);
		
		al.remove(3);
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		
		for(String ob:al)
		{
			System.out.println(ob);
		}
		
		int arr[]= {10,12,15,17};
		for(int i:arr)
		{
			System.out.println(i);
		}
			
		
		
	}

}
