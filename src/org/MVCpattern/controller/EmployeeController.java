package org.MVCpattern.controller;

import org.MVCpattern.model.Employee;
import org.MVCpattern.view.EmployeeView;

public class EmployeeController {
	private Employee model;

	private EmployeeView view;

	/**
	 * @param model
	 * @param view
	 */
	public EmployeeController(Employee model, EmployeeView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public String getEmployeeName() {
		return model.getName();
	}

	public void setEmployeeName(String name) {
		model.setName(name);
	}

	public double getEmployeeSalary() {
		return model.getSalary();
	}

	public void setEmployeeSalary(double salary) {
		model.setSalary(salary);
	}

	public void updateEmployeeView() {
		view.printEmployee(model.getName(), model.getSalary());
	}
}
