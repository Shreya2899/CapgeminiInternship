package Employee;

import Employee.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new EmployeeService();
		es.getEmpDetails();
		es.displayEmpDetails();
	}

}
