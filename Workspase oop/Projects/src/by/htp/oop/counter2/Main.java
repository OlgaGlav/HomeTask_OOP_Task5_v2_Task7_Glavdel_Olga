package by.htp.oop.counter2;

import java.util.Scanner;
import by.htp.oop.counter2.Counter;
import by.htp.oop.counter2.Logic;

public class Main {
	
	public static void main(String[] args) {

		int counter;
		int min;
		int max;
		
//Инициализируем  данные
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите нижний предел диапазона: ");
		min = sc.nextInt();

		System.out.print("Введите верхний предел диапазона: ");
		max = sc.nextInt();

		System.out.print("Введите десятичное число: ");
		counter = sc.nextInt();
		
		Counter count = new Counter(counter, min, max);
		
		
//выводим текущее показание 
		
		Counter currentCount = new Counter(counter);
				
		System.out.println("Текущее состояние счетчика равно "+counter);
		
		
//изменяем значение счетчика и выводим на консоль
		
		Logic temp = new Logic();

		if (temp.check(count) >= 10) {
			System.out.println("Ваше число не принадлежит обозначенному интервалу. ");
			
		} else if (temp.check(count) == 2) {
			System.out.println("Уменьшение счетчика приведет к превышению указанного интервала. ");
			System.out.println("При увеличении счетчика получаем значение " + temp.increment(currentCount));
			
		} else if (temp.check(count) == 0) {
			System.out.println("При уменьшении счетчика получаем значение " + temp.decrement(currentCount));
			System.out.println("При увеличении счетчика получаем значение " + temp.increment(currentCount));
			
		} else if (temp.check(count) == 1) {
			System.out.println("При уменьшении счетчика получаем значение " + temp.decrement(currentCount));
			System.out.println("Увеличение счетчика приведет к превышению указанного интервала. ");
		}
				
	}

}
