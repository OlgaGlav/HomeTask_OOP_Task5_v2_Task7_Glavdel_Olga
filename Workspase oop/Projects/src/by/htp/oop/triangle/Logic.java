package by.htp.oop.triangle;

public class Logic {

	public double distance(double x1, double y1, double x2, double y2) {
		double d;

		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return d;

	}

	
	public double perimetr(Triangle triangle) {
		double sizeA = triangle.getSideA();
		double sizeB = triangle.getSideB();
		double sizeC = triangle.getSideC();

		return sizeA + sizeB + sizeC;
	}

	
	public double square(Triangle triangle) {
		double sizeA = triangle.getSideA();
		double sizeB = triangle.getSideB();
		double sizeC = triangle.getSideC();
		double temp = (sizeA + sizeB + sizeC) / 2.0;

		double square = Math.sqrt(temp * (temp - sizeA) * (temp - sizeB) * (temp - sizeC));

		return square;

	}
	
	public double medianPoint(double x1, double x2,double x3) {
		
		double medianPoint=(x1+x2+x3)/3.0;
		
		return medianPoint;
	}

}
