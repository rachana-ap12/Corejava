package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int age = 10;
			if(age<18) {
				throw new ArithmeticException("not valid");
			}
			else {
				System.out.println("welcome to vote");
			}

		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}
	}

}
