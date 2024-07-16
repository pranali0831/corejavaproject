package MapWithList;
import java.util.*;
public class TestPrimitive {
	public static void main(String args[])
	{
		List<String> mh=new ArrayList<>();
		   mh.add("Satara");
		   mh.add("Pune");
		   
		   
	List<String> jh=new ArrayList<>();
	          jh.add("Ranchi");
	          jh.add("lohardaga");
	          
	Map<String,List<String>>india=new HashMap<>();
	           india.put("Maharashtra", mh);
	           india.put("jharkhand", jh);
	           
	           Set<String> cities=india.keySet();
	           Iterator<String> itr=cities.iterator();
	               while(itr.hasNext())
	                {
	        	        String city=itr.next();
	        	        System.out.println(city);
	        	         List<String> town=india.get(city);
	        	          Iterator<String> itr2=town.iterator(); 
	        	             while(itr2.hasNext())
	        	             {
	        	            	 String s=itr2.next();
	        	            	 System.out.println(s);
	        	             }
	                
	        	      
	        	    	  
	        	    	  
	        	    	    	  
	           }
	          
	           System.out.println("----for loop----");
	           for(String keys:cities)
	           {
	        	  System.out.println(keys);
	        	  List<String>list=india.get(keys
	        			  );
	        	  for(String city: list)
	        	  {
	        		  System.out.println(city);
	        	  }
	           }
	           
	           
	}

	
}
