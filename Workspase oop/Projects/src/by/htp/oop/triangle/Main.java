package by.htp.oop.triangle;

import by.htp.oop.triangle.Logic;
import by.htp.oop.triangle.Triangle;

public class Main {

	public static void main(String[] args) {
		double sizeA;
		double sizeB;
		double sizeC;

		double perimetr;
		double square;
		double medianPointX;
		double medianPointY;

		Consol coordinate = new Consol();

		Logic parametr = new Logic();

		sizeA = coordinate.triangleDisplay("Введите длину стороны А: ");
		sizeB = coordinate.triangleDisplay("Введите длину стороны B: ");
		sizeC = coordinate.triangleDisplay("Введите длину стороны C: ");

		if (sizeA == 0 || sizeB == 0 || sizeC == 0) {

			double x1;
			double y1;

			double x2;
			double y2;

			double x3;
			double y3;

			x1 = coordinate.triangleDisplay("Введите значение координаты х1: ");
			y1 = coordinate.triangleDisplay("Введите значение координаты y1: ");
			x2 = coordinate.triangleDisplay("Введите значение координаты х2: ");
			y2 = coordinate.triangleDisplay("Введите значение координаты y2: ");
			x3 = coordinate.triangleDisplay("Введите значение координаты х3: ");
			y3 = coordinate.triangleDisplay("Введите значение координаты y3: ");

			sizeA = parametr.distance(x1, y1, x2, y2);
			sizeB = parametr.distance(x2, y2, x3, y3);
			sizeC = parametr.distance(x3, y3, x1, y1);
			
			medianPointX = parametr.medianPoint (x1,x2,x3);
			medianPointY = parametr.medianPoint (y1, y2,y3);
			System.out.println("Координаты точки пересечения медиан (" + medianPointX+" ; "+medianPointY+")");
			
		} else {
			
			System.out.println("Недостаточно данных для нахождения координат точки пересечения медиан. ");
		}

		Triangle triangle = new Triangle(sizeA, sizeB, sizeC);

		perimetr = parametr.perimetr(triangle);
		System.out.println("Периметр данного треугольника равен " + perimetr);
		
		square=parametr.square(triangle);
		System.out.println("Площадь данного треугольника равна " + square);

	}

}
