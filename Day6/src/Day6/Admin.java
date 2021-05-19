package Day6;

public class Admin extends PayRoll {
	public String name;
	public int salary;
	Admin(){}
	public Admin(String name, int salary) {
		this.name= name;
		this.salary= salary;
		super.adjustSalary(salary);
	}
	public void doAdminStuff() {
		System.out.println("Admin Stuff doing");
	}
}
