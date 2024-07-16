package StudentMapOfList;
import java.util.*;
public class College {
	public Map<Integer,List<Student>> m1()
	{
		Map<Integer,List<Student>> eng=new HashMap<>();
		
		 List<Student> fe=new ArrayList<>();
		   
		 Student s=new Student();
	        s.setRollno(1); 
	        s.setName("xyz"); 
		   Student s1=new Student();
		        s1.setRollno(2); 
		        s1.setName("pqr"); 
		        
		        fe.add(s);
		        fe.add(s1);
		        
		   List<Student> se=new ArrayList<>();   
		    Student s11=new Student();
		        s11.setRollno(3); 
		        s11.setName("abc");
		        
		        Student s12=new Student();
		        s12.setRollno(4); 
		        s12.setName("jkl");
		
		     se.add(s11);
		     se.add(s12);
		     
		     eng.put(1111, fe);
		     eng.put(2222, se);
		     
		     return eng;
	}
	
	public static void main(String args[])
	{
		College c=new College();
		Map<Integer,List<Student>> data =c.m1();
		
		   Set<Integer>keys=data.keySet();
		    Iterator<Integer> itr=keys.iterator();
		      while(itr.hasNext())
		      {
		    	  int key=itr.next();
		    	  System.out.println(key);
		    	  List<Student> data1=data.get(key);
		    	    Iterator<Student> itr2=data1.iterator();
		    	     while(itr2.hasNext())
		    	     {
		    	    	  Student sp=itr2.next();
		    	    	  System.out.println(sp.getRollno());
		    	    	  System.out.println(sp.getName());
		    	     }
		      }
	}

	
}

