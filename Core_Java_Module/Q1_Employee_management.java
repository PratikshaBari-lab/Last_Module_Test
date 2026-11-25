
public class Employee_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp_1 = new Developer(101, "Rahul", 65000.0, 12000.0);
		Employee emp_2 = new Manager(102, "Amit", 80000.0, 15000.0);

		emp_1.employeeDetails();
		emp_2.employeeDetails();
	}

}


class Employee {
	
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	
	public Employee(int emp_id, String emp_name, double emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public double calsal() {
		return emp_salary;
	}
	
	public void employeeDetails() {
		System.out.println("\nemp_id=" + emp_id );
		System.out.println("emp_name=" + emp_name); 
		System.out.println("emp_salary=" + calsal());
	}
	
}

class Developer extends Employee{

	double project_bonus;
	
	public Developer(int emp_id, String emp_name, double emp_salary, double project_bonus) {
		super(emp_id, emp_name, emp_salary);
		this.project_bonus = project_bonus;
	}

	public double getProject_bonus() {
		return project_bonus;
	}

	public void setProject_bonus(double project_bonus) {
		this.project_bonus = project_bonus;
	}

	
	
	@Override
	public double calsal() {
		// TODO Auto-generated method stub
		return getEmp_salary()+project_bonus;
	}

	@Override
	public void employeeDetails() {
		super.employeeDetails();
	}

}

class Manager extends Employee{

	double allowance;
	
	public Manager(int emp_id, String emp_name, double emp_salary, double allowance) {
		super(emp_id, emp_name, emp_salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public double calsal() {
		// TODO Auto-generated method stub
		return getEmp_salary()+allowance;
	}
	
	@Override
	public void employeeDetails() {
		super.employeeDetails();
	}	
	
}
