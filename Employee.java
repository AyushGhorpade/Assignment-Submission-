import java.util.ArrayList;
import java.util.List;

class Employee {
    private int eid;
	private String ename;
	private double esalary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

    public void displayDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esalary);
        System.out.println("---------------------------");
    }


  public static void main(String[] args) {

      Employee e1 = new Employee();
    	e1.setEid(101);
    	e1.setEname("Ayush");
    	e1.setEsalary(76543.98);
    	
    	Employee e2 = new Employee();
    	e2.setEid(102);
    	e2.setEname("Amol");
    	e2.setEsalary(50484.49);
    	
    	Employee e3 = new Employee();
    	e3.setEid(103);
    	e3.setEname("Athrva");
    	e3.setEsalary(98443.12);
    	
    	List<Employee> empList = new ArrayList<Employee>();
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	
    	for (Employee emp : empList) {
            emp.displayDetails();  
        }
    	

    }
}



