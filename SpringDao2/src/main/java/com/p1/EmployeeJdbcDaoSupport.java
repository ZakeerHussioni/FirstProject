package com.p1;

import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
 
public class EmployeeJdbcDaoSupport extends JdbcDaoSupport
{
   
    public Employee getEmployeeById(int id){
        String sql = "select * from employee where id= ?";
        Employee employee = 
           getJdbcTemplate().queryForObject(sql, new Object[]{new Integer(id)} , new EmployeeRowMapper());
        return employee;
    }
 
    public List<Employee> getAllEmployees(){
        String sql = "select * from employee ";
        List<Employee> employee = 
              getJdbcTemplate().query(sql,  new EmployeeRowMapper());
        return employee;
    }
 
    public Employee updateEmployee(String name, int id){
        String sql ="update employee set name = ? where id = ?";
        getJdbcTemplate().update(sql, new Object[]{name,new Integer(id)}); 
        Employee emp = getEmployeeById(id);
        return emp;
    }
  
    public void insertEmployee(int id, String name , int age, int salary){
        String sql = "insert into Employee value (?,?,?,? )";
        getJdbcTemplate().update(sql, new Object[]{new Integer(id), name,new Integer(age),new Integer(salary) }); 
    }
     
    public void deleteEmployee(int id){
         String sql ="delete from employee where id = ?";
         getJdbcTemplate().update(sql, new Object[]{new Integer(id)});
    } 
}