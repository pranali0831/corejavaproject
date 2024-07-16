package WorldMap_Set_List_Ex;
import java.util.*;
public class TestEx {
	public static void main(String args[])
	{
     List<String>mh=new ArrayList<>();
        mh.add("Pune");
        mh.add("Mumbai");
     List<String>mp=new ArrayList<>();
        mp.add("Bhopal");
        mp.add("Indor");
     Set<List<String>> india=new HashSet<>();
                   india.add(mh);
                   india.add(mp);
                   
       List<String>State1=new ArrayList<>();
                   State1.add("city1");
                   State1.add("city2");
       List<String>State2=new ArrayList<>();
                   State2.add("city3");
                   State2.add("city4");
       Set<List<String>> japan=new HashSet<>();
                  japan.add(State1);
                  japan.add(State2);
       Map<String,Set<List<String>>>world=new HashMap<>();
                   world.put("--japanese--", japan);
                   world.put("--indian--", india);
                   System.out.println(world);
                   
               Set<String> keys=world.keySet();
               Iterator<String>itr =keys.iterator();
                  while(itr.hasNext())
                  {
                	  String key=itr.next();
                	  System.out.println(key);
                	  
                	      Set<List<String>> values=world.get(key);
                	   
                	  Iterator<List<String>>itr2=values.iterator();
                	        while(itr2.hasNext())
                	      {
                	    	   List<String> country=itr2.next(); 
                	    	   
                	    	     Iterator<String> itr3=country.iterator();
                	    	           while(itr3.hasNext())
                	    	           {
                	    	        	    String city=itr3.next();
                	    	        	     System.out.println(city);
                	    	           }
                	    	   
                	      }
                  }
               System.out.println("Enhanced for loop--------");      
              for(String key:keys)
              {
            	  System.out.println(key);
            	  Set<List<String>> values=world.get(key); 
            	     for(List<String> country:values)
            	     {
            	    	 //System.out.println(country);
            	    	    for(String city:country)
            	    	    {
            	    	    	System.out.println(city);
            	    	    }
            	    	 
            	     }
              }
              System.out.println(" lambda expression--------");              
               world.forEach((key,values)->values.forEach(country->country.forEach(city1->System.out.println(key+"  "+city1))));             
         
	
	}
}
