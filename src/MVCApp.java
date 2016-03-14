import org.MVCpattern.controller.EmployeeController;
import org.MVCpattern.model.Employee;
import org.MVCpattern.view.EmployeeView;

public class MVCApp {

	public static void main(String[] args) {
		// Create some data
		Employee employee = new Employee();
		employee.setName("Mafalda");
		employee.setSalary(1000);

		// Create view
		EmployeeView view = new EmployeeView();

		// Create controller
		EmployeeController controller = new EmployeeController(employee, view);

		// Show data
		controller.updateEmployeeView();

		// Change some data from employee
		controller.setEmployeeSalary(1500);

		// Update view
		controller.updateEmployeeView();

	}

}
