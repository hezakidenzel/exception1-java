package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Method1();
		
		System.out.println("End of Program");
	}
	public static void Method1() {
		System.out.println("**********Method 1Start************");
		
		Method2();
		System.out.println("**********Method 1 End************");
	}
	
	public static void Method2() {
		Scanner ler = new Scanner(System.in);
		System.out.println("*************Method2 Start**********");
		try {
		String[] vect = ler.nextLine().split(" ");
		
		int position = ler.nextInt();
		
		System.out.println(vect[position]);
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			ler.next();
		}
		
		catch(InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		System.out.println("*********Method2 end***********");
	}

}
