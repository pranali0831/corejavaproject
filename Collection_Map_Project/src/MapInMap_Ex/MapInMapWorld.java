package MapInMap_Ex;
import java.util.*;
public class MapInMapWorld {
	public static void main(String args[])
	{
     List<String>mh=new ArrayList<>();
        mh.add("Pune");
        mh.add("Mumbai");
     List<String>mp=new ArrayList<>();
        mp.add("Bhopal");
        mp.add("Indor");
     Map<Integer,List<String>> india=new HashMap<>();
                   india.put(1,mh);
                   india.put(2,mp);
                   
       List<String>State1=new ArrayList<>();
                   State1.add("city1");
                   State1.add("city2");
       List<String>State2=new ArrayList<>();
                   State2.add("city3");
                   State2.add("city4");
      Map<Integer,List<String>> japan=new HashMap<>();
      japan.put(1,State1);
      japan.put(2,State2);
       Map<Integer,Map<Integer,List<String>>> world=new HashMap<>();
                           world.put(111, japan);
                           world.put(222, india);
       
            Set<Integer> keys=world.keySet();
            Iterator<Integer> itr=keys.iterator();
              while(itr.hasNext())
              {
            	  Integer key=itr.next();
            	  System.out.println(key);
            	  Map <Integer,List<String>> country=world.get(key);
            	  
            	  Set<Integer> st=country.keySet();
            	  Iterator<Integer> itr2=st.iterator();
            	      while(itr2.hasNext())
            	       {
            	    	 int s=itr2.next();
            	    	 System.out.println(s);
            	    	 
            	    	    List<String> city=country.get(s);
            	    	   Iterator<String> itr3=city.iterator();
            	    	      while(itr3.hasNext())
            	    	      {
            	    	    	String town=itr3.next();
            	    	    	System.out.println(town);
            	    	      }
            	       }
              } 
              System.out.println("for enhanced loop");
               
             for(Integer key:keys)
              {
            	 System.out.println(key);
            	  Map<Integer, List<String>> country=world.get(key);
            	  Set<Integer> st=country.keySet();
            	               for(Integer city:st)
            	                {
            	                    System.out.println(city); 
            	                    
            	                    List<String> z=country.get(city);
            	                   
            	                    for(String y:z)
            	                    {
            	                    	System.out.println(y);
            	                    }
            	                }
              }
             System.out.println("for enhanced loop");    
	world.forEach((key,value)->value.forEach((country,city)->city.forEach(town->System.out.println(key+"  "+town))));

}
}