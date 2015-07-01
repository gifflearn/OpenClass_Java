package edu.jf.exceptions_;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =20,i =0;
		System.out.println("Example 1\n");
		try {
			System.out.println(j/i);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("Division par zéro  " + e.getMessage());
		}
		System.out.println("Coucou\n\n");
		
		//
		System.out.println("Example 2\n");
		try {
			System.out.println("=> " + (1/0));
		} catch (ClassCastException e) {
			// TODO: handle exception
			
			e.printStackTrace();
			System.out.println("Coucou");
		} finally {
		System.out.println("Coucou finally\n\n");
		}
	}

}
