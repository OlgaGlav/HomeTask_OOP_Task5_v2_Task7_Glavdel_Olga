package by.htp.oop.counter2;

public class Counter {
	private int counter;
	private int max;
	private int min;

	public Counter() {
		this.counter = 0;
		this.max = 0;
		this.min = 0;
	}

	public Counter(int counter) {
		this.counter = counter;
	}
	
	public Counter(int counter, int min, int max) {
		this.counter = counter;
		this.max = max;
		this.min = min;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + max;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

}
