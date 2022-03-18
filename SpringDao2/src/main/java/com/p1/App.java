package com.p1;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String args[]){
		ApplicationContext context = 
                new ClassPathXmlApplicationContext("beans.xml");        
            EmployeeJdbcDaoSupport employeeJdbcTemplate = 
                (EmployeeJdbcDaoSupport)context.getBean("employeeJdbcDaoSupport");
  
            // Display current state of Employee table         
            List<Employee> emp = employeeJdbcTemplate.getAllEmployees();
            System.out.println("Current State of employee table -");
            System.out.println(emp);
 
            // insert new employee    
            employeeJdbcTemplate.insertEmployee(202, "Ujala", 23, 5000);
 
            // Display inserted employee        
            Employee insertedEmployee = employeeJdbcTemplate.getEmployeeById(200);
            System.out.println("Inserted Employee Information from Employee Table - ");
            System.out.println(insertedEmployee);
 
            // update employee        
            Employee updatedEmployee = employeeJdbcTemplate.updateEmployee("Mohan", 200);
            System.out.println("Updated Employee Information from Employee Table - ");        
            System.out.println(updatedEmployee);
   
            //delete employee        
            employeeJdbcTemplate.deleteEmployee(201);
 
            // display total number of employees
         //   int count = employeeJdbcTemplate.getTotalNumberOfEmployees();
            //System.out.println("total number of employees : " + count);        
            emp = employeeJdbcTemplate.getAllEmployees();
            System.out.println("Current State of employee table -");
            System.out.println(emp); 
            ((AbstractApplicationContext) context).close();
     }
}
