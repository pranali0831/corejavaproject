package EmployeeMap_With_Generic;
import java.util.*;
public class Company {
	public  Map<Integer,Employee> designation() 
	{
		Map<Integer,Employee>team= new HashMap();
		Employee emp=new Employee();
		         emp.setId(2);
		         emp.setName("xyz");
		         emp.setEsalary(20000);
		         
		 Employee emp1=new Employee();
		         emp1.setId(3);
		         emp1.setName("pqr");
		         emp1.setEsalary(30000);
		         
		 Employee emp2=new Employee();
		         emp2.setId(1);
		         emp2.setName("xyz");
		         emp2.setEsalary(20000);      
		         
		         
		         team.put(11,emp);
		         team.put(22,emp1);  
		         team.put(33,emp2); 
		   
		   return team;
		
	}
	public static void main(String args[])
	{
		Company cm=new Company();
		Map<Integer,Employee>  d =cm.designation();
		    Set<Integer> keys=d.keySet();
		    Iterator<Integer>itr=keys.iterator();
		       while(itr.hasNext())
		       {
		    	   int key=itr.next();
		    	   Employee val=d.get(key);
		    	   System.out.println(val.getId());
		    	   System.out.println(val.getName());
		    	   System.out.println(val.getEsalary());
		    	   
		       }
		       
		       System.out.println("enhanced for loop---------");
		       for(Integer key :keys)
		       {
		    	   System.out.println(key);
		    	         Employee emp=d.get(key);
		    	         
		    	         System.out.println(emp.getId());
				    	   System.out.println(emp.getName());
				    	   System.out.println(emp.getEsalary());
		       }
	
	System.out.println("lambda expression loop---------");
	    d.forEach((id,emp)->System.out.println(id+"  "+emp.getId()+"  "+emp.getName()+"    "+emp.getEsalary()));
	}

}
