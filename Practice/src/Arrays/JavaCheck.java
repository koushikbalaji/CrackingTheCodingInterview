package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class JavaCheck {

	public static void main(String ar[])
	{
		
		HashMap<String,Integer> myMap=new HashMap<String,Integer>();
		
		myMap.put("1",1);
		myMap.put("2",2);
		myMap.put("3",3);
		
//		for(Map.Entry<String,Integer> a:myMap.entrySet())
//		{
//			myMap.remove(a.getKey());
//			
//		}
		
		Iterator it=myMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			
			Map.Entry<String,Integer> entry=(Entry<String, Integer>) it.next();
			
			it.remove();
			
		}
		
		System.out.println(myMap.size());
		
		
		
	}
	
}
