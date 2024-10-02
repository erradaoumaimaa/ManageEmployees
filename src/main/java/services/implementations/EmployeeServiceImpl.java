package services.implementations;

import java.util.List;
import java.util.Optional;

import DAO.interfaces.EmployeeDAO;
import models.Employee;
import services.interfaces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}

	@Override
	public void removeEmployee(int id) {
		employeeDAO.removeEmployee(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public List<Employee> filterEmployees(String search) {
		return null; 
	}

	@Override
	public Optional<Employee> findById(int id) {
		return employeeDAO.findById(id);
	}
}
