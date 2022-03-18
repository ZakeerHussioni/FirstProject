package com.p4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;  

public class ExampleListTestCases 
{
	static ExampleList obj; 
	
	 @BeforeClass  //@Before
	    public  static void mtbeforeClass()
	    {
		  obj= new ExampleList();  
		  System.out.println("Inside BeforeClass");
		  //	System.out.println("Inside Before");
		}
	    
		/*
		 * @Before public void mtBefore() { System.out.println("Inside Before"); }
		 */
	     
	    @Test  
	    public void testAdd() {  
	        obj.add("Emma");  
	        obj.add("Ronan");  
	        obj.add("Antonio");  
	        obj.add("Paul");  
	        System.out.println("Inside testAdd()"+" "+ obj);
	        assertEquals("Adding 4 student to list", 4, obj.sizeOfStudent());  
	    }  
	      
	    @Test  
	    public void testSize() {  
	    	System.out.println("Inside testSize()"+" "+ obj);
	        obj.add("Emma");  
	        obj.add("Ronan");  
	        obj.add("Antonio");  
	        assertEquals("Checking size of List", 7, obj.sizeOfStudent());  
	    }  
	      
	    @Test  
	    public void testRemove() {  
	    	System.out.println("Inside testRemove()"+" "+ obj);
	        obj.add("Antonio");  
	        obj.add("Paul");  
	        obj.remove("Paul");  
	        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());  
	    }  
	      
	    @Test  
	    public void testremoveAll() {  
	    	System.out.println("Inside testremoveAll()"+" "+ obj);
	        obj.removeAll();  
	    }  
	} 