package IndiaSetMap_Ex;
import java.security.Key;
import java.util.*;

public class Test {
	public static void main(String args[])
	{
		Set<String>mh=new TreeSet<>();
		           mh.add("Pune");
		           mh.add("Mumbai");
	 Set<String>mp=new TreeSet<>();
		           mp.add("Bhopal");
		           mp.add("Indor");
		           
     Map<Integer,Set<String>> india=new HashMap<>();
                           india.put(1, mh);
                           india.put(2, mp);
     Set<Integer> data=india.keySet();
          Iterator<Integer>itr=data.iterator();
                  while(itr.hasNext())
                  {
                	  int key=itr.next();
                	  System.out.println(key);
                	Set<String> values=india.get(key);
                	Iterator<String> itr2=values.iterator();
                	 while(itr2.hasNext())
                	 {
                		 String city=itr2.next();
                		 System.out.println(city);
                	 }
                  }
                  System.out.println("Enhanced for loop------");
                  for(int key:data)
                  {
                	  System.out.println(key);
                	  Set<String> values=india.get(key);
                	     for(String city:values)
                	     {
                	    	 
                	    	 System.out.println(city);
                	     }
                  }
                  System.out.println(" forEach loop------");
                  india.forEach((Key ,values)->values.forEach(city->System.out.println(Key+"  "+city)));
                  
            
	}
	

}
