package edu.jf.exceptions_;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =20,i =0;
		System.out.println("Example 1\n");
		try {
			System.out.println(j/i);
		} catch (ArithmeticException e) {
					
			System.out.println("Division par zéro  " + e.getMessage());
			System.out.println("Coucou from catch");
		}
		System.out.println("\nCoucou main\n");
		
		//
		System.out.println("Example 2\n");
		try {
			System.out.println("=> " + (1/0));
		} catch (ClassCastException e) {
			e.printStackTrace();
			System.out.println("Coucou from catch1");
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Coucou from catch2");
		} finally {
		System.out.println("Coucou from finally\n\n");
		}
	}

}
