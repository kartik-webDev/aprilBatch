package package03;

public class Employee {
	
	String EmpName = "Rohan";
	
	String EmpProfesssion = "Backend Dev";
	
	int EmpSalary = 250000;
	
	String EmpRegion = "Asia";
	
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		
		Employee empObj = new Employee();
		
		System.out.println(empObj.EmpName);
		
		System.out.println(empObj.EmpProfesssion);
		
		System.out.println(empObj.EmpSalary);
		
		System.out.println(empObj.EmpRegion);
		
		System.out.println("last line of the code");
		
	}

}
