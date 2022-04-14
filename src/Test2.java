

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("Sumit");
		li.add(45);
		li.add(100.00);
		li.add('A');
		System.out.println("list of variable "+ li);
		System.out.println("size of list "+ li.size());
		
		li.add(1, "Kandalkar");
		System.out.println("list after adding object "+ li);
		for(int i=0; i<li.size();i++)
		{
			System.out.println("list of variable for loop "+ li.get(i));
		}
		for(Object j:li)
		{
			System.out.println("list of variable for each "+ j);
		}
		li.remove(0);
		
		System.out.println("list after removing object "+ li);
		
		System.out.println("list  "+li.isEmpty());
		Iterator it =li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
