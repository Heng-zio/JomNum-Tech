 public class Main {
	public static void main(String[] args) {
                int employeeIdAsPrimitive = 12345;
		//Declare variable with Wrapper Class data type
     
		Integer employeeId = employeeIdAsPrimitive; //convert from primitive to wrapper class (autoboxing)
		String employeeName = "Lim Sokminear";
		String position = "FullStack Developer";
		Float averageSalary = 700.50f;
		Boolean isEmployee = true;
		Double bonus = 200.90d;

                // print the employee info
		System.out.println("Employee ID Before convert to Wrapper class : " + employeeIdAsPrimitive);
                System.out.println("Employee name: " +  employeeName); 
                System.out.println("Position: " +  position);
                System.out.println("Salary: " +  averageSalary);
                System.out.println("Is Employee: " +  isEmployee);
                System.out.println("Bonus: " +  bonus);

 }
 }
