public class Student {

	String name; //non-static
	static String school = "JomNum Tech";
	
	public static void main (String[] args) {
	
		Student student1 = new Student();
		student1.name = "Chantha";
		System.out.println("Student name is: " + student1.name + " and study Java short course at " + Student.school);
		Student student2 = new Student();
		student2.name = "Muslim";
		System.out.println("Student name is: " + student2.name + " and study Java short course at " + Student.school);


	}
}
