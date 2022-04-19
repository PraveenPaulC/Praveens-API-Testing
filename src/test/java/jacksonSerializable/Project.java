package jacksonSerializable;

public class Project {
	String employeeName;
	int employeeAge;
	double empSalary;
	int teamSize;
	
	public Project(String employeeName, int employeeAge, double empSalary, int teamSize) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.empSalary = empSalary;
		this.teamSize = teamSize;
	}
	
	public Project() {
		
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	

}
