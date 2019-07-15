package dao;

import java.util.HashMap;

import dto.Employee;
import exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
	
    //Getter and Setter for map   
    public static void setMap(HashMap<Integer,Employee> map)
    {
		EmployeeDaoImpl.map=map;
    }  

    public static HashMap<Integer,Employee> getMap()
    {
		return map;
    }  

    //implement interface methods
    public void insertEmployee(Employee employee){
        map.put(employee.getEmpId(), employee);
        System.out.println("Employee Information stored successfully for " +employee.getEmpId());
    }
    
    public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException{
        if(map.isEmpty()){
        	System.out.println(" No employee found");
        	return null;
            //throw Employee Exception;
        }
        else
            return map;
        
    }
    
    public Employee getEmployeeById(int id) throws EmployeeException{
        if(map.containsKey(id)){
            return map.get(id);
        }
        else
          return null;
        
    }
}