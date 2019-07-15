package service;

import java.util.HashMap;
import java.util.regex.Pattern;

import dao.*;
import dto.Employee;
import exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService {
	 EmployeeDaoImpl  employeeDaoImplObj=new  EmployeeDaoImpl();
	  public void insertEmployee(Employee emp) {
		  employeeDaoImplObj.insertEmployee(emp);
	  }
	  public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException{
		  HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
		  return  hm;
	  }
	  public Employee getEmployeeById(int id)throws EmployeeException{
		 Employee e= employeeDaoImplObj.getEmployeeById( id);
		 return e;
	  }
	  public boolean validateName(String name) {
		  
	
		  if(Pattern.matches("[A-Z][a-z]*", name)&&name.length()>=3) {
			  return true;
	  }else
		return false;
		 
}
	  public boolean validateSalary(int salary) {
		  if(salary<0)
			  return false;
		  else 
			  return true;
	  }
}
