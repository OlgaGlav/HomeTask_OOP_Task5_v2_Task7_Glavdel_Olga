package by.htp.oop.triangle;

import java.util.Scanner;
import by.htp.oop.clock2.Main;

public class Consol {

	public double triangleDisplay(String message) {
		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		x = sc.nextDouble();
		return x;
	}
	
	

}
