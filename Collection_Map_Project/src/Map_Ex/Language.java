package Map_Ex;
import java.util.*;
public class Language {

	public static void main(String args[])
	{
		Map<Integer,String>m=new HashMap<>();
		             m.put(1,"java");
		             m.put(2,"C++");
		             m.put(3,"python");  
		             m.put(4,"R");
		             
		             System.out.println(m);
		             
		         Set<Integer> no=m.keySet();
		         
		         Iterator<Integer> itr=no.iterator();
		          while(itr.hasNext())
		          {
		        	  int id=itr.next();
		        	   String lang=m.get(id);
		        	   System.out.println( id+"  "+lang);
		          }
	}
}
