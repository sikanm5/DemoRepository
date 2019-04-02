package day2;

public class callingVariables {

	public static void main(String[] args) {
		
		
		VariablesInJava.collage = "seneca";  // ASSIGNING value to static variable
		
		VariablesInJava vj =  new VariablesInJava("sachin", 10);
		VariablesInJava vj1 = new VariablesInJava("Alam", 20);
		
		vj.printStudentDetails();
		vj1.printStudentDetails();
		
	}

}
