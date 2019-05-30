package by.htp.oop.counter2;

	import by.htp.oop.counter2.Counter;

	public class Logic {

		public int check(Counter count) {
			int counter = count.getCounter();
			int min = count.getMin();
			int max = count.getMax();
			
//переменная  checkCounter  введена для выбора текста, который выведется на консоль при проверке на попадание в диапазон
// если пользователь ввел число, не попадающее в интервал, то checkCounter>10,
//если число превышает максимум, то выводится другой текст и считается только уменьшение счетчика
// если введеное число меньше минимума, то считается только увеличение счетчика и выводится текс о невозможности уменьшить счетчик
			
			int checkCounter = 0;                                               
			if (counter > max || counter < min) {
				checkCounter = 10;
			} else if (counter >= max) {
				checkCounter = 1;
			} else if (counter <= min) {
				checkCounter = 2;
			}
			return checkCounter;
		}

		public int increment(Counter currentCount) {
			int counterIncr = currentCount.getCounter()+1;
			return counterIncr;
		}

		public int decrement(Counter currentCount) {
			int counterDecr = currentCount.getCounter() - 1;
			return counterDecr;
		}

}
