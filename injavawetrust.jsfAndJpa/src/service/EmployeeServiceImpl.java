package service;

import java.util.List;

import model.Employee;
import dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAOImpl employeeDAOImpl;

	public EmployeeServiceImpl() {
		employeeDAOImpl = new EmployeeDAOImpl();
	}

	private EmployeeDAOImpl getEmployeeDAOImpl() {
		return employeeDAOImpl;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return getEmployeeDAOImpl().insertEmployee(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		return getEmployeeDAOImpl().findEmployee(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return getEmployeeDAOImpl().findAllEmployees();
	}

	@Override
	public void removeEmployee(int id) {
		getEmployeeDAOImpl().removeEmployee(id);
	}
}
