package day2;

public class VariablesInJava {

	//3 kind of variables
	//local     - local to methods - stack
	//instance  - local to instance - heap
	//static    - class level - class loader area
	
	static String collage;   //static variable
	String student; //instance
	int rollNo;     //instance 
	
	
	//constructor
	public VariablesInJava(String name,int roll) {
		student = name;
		rollNo = roll;
	}
	
	public void printStudentDetails() {
		System.out.println("collage " + collage + "----------"  + 
							"name "   + student + "----------"  + 
							"rollno " + rollNo);
	}
	
	public void testForLocalVar() {
		int z = 0;   //local 
		System.out.println(z);
	}
	
}
