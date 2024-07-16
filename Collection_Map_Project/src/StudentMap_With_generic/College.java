package StudentMap_With_generic;
import java.util.*;
public class College {
	
	
	
	public  Map<Integer, Student> m1()
	{
		Map < Integer,Student> eng=new HashMap();
		Student s=new Student();
		   s.setRollno(1);
		   s.setName("xyz");
		   
		   Student s1=new Student();
		      s1.setRollno(2);
		      s1.setName("abc");
		      
		      eng.put(111, s);
		      eng.put(222, s1);
		   return eng;	
	}
	 public static void main(String args[])
	 {
		 College c=new College();
		 Map<Integer, Student> x =c.m1();
		   Set<Integer>keys= x.keySet();
		 Iterator<Integer>itr=keys.iterator();
		          while(itr.hasNext())
		          {
		        	 int id= itr.next();
		        	 System.out.println(id);
		        	    Student values=x.get(id);
		        	    System.out.println(values.getRollno());
		        		   System.out.println(values.getName());
		        	 
		          }
		          
		          
		          System.out.println("Enhanced for loop--------------");
       		  
		          for(Integer id:keys)
		          {
		        	  System.out.println(id);
		        	              Student values=x.get(id);
		        	              System.out.println(values.getRollno());
				        		   System.out.println(values.getName());
		          }
		          
		          
		          System.out.println(" lambda expression loop--------------");
	       		  
		          x.forEach((k,v)->System.out.println(k+"  "+v.getRollno()+"  "+v.getName()));
	 }
	     
	
	

	
}
