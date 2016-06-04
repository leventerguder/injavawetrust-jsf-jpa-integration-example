package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import service.EmployeeServiceImpl;
import model.Employee;

@ManagedBean
@SessionScoped
public class EmployeeController {

	private String name;
	private String surname;
	private int salary;
	private List<Employee> employees = new ArrayList<Employee>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	
	public void addEmployee() {

		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		employeeService.createEmployee(name, surname, salary);

		employees = employeeService.findAllEmployees();

	}

	public void deleteEmployee(int id) {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		employeeService.removeEmployee(id);

		employees = employeeService.findAllEmployees();

	}
}
