package test;

public class ClassB {
	String myName;
	
	public ClassB() {
		System.out.println("Inside Class B Constructor");
	}
	public ClassB(String Name) {
		System.out.println("Inside Class B Constructor");
		System.out.println("Name is:" +Name);
		
		myName = Name;
	}

}
