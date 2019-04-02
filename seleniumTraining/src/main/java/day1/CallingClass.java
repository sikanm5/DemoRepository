package day1;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create the object
		TestClass1 cl = new TestClass1();
		cl.testMethod1();
		
		cl.testMethod2();
		
		//cl.y = 10;
		
		System.out.println(cl.y);   //garbage  , nothing   - 0
		System.out.println(cl.x);  //garbage  , nothing   -  null
	}

}
