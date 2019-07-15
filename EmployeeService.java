package service;
import dto.*;
import exception.EmployeeException;
import java.util.HashMap;

//import dto.Employee;
//import exception.EmployeeException;

public interface EmployeeService 
{
    public void insertEmployee(Employee emp);
    
    public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException;
     
    public Employee getEmployeeById(int id)throws EmployeeException;
	
}
