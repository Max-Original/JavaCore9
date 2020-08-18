package javacore9;

public class Methods {

	int a, b;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Integer addition() throws IllegalAccessException, MyException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if (a == 0 & b != 0) {
			throw new ArithmeticException();
		} else if (a != 0 & b == 0) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("error");
		} else {
			return a + b;
		}

	}

	public int subtraction() throws IllegalAccessException, MyException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if (a == 0 & b != 0) {
			throw new ArithmeticException();
		} else if (a != 0 & b == 0) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("error");
		} else {
			return a - b;
		}
	}

	public double multiplication() throws IllegalAccessException, MyException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if (a == 0 & b != 0) {
			throw new ArithmeticException();
		} else if (a != 0 & b == 0) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("error");
		} else {
			return a * b;
		}
	}

	public double division() throws IllegalAccessException, MyException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if (a == 0 & b != 0) {
			throw new ArithmeticException();
		} else if (a != 0 & b == 0) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("error");
		} else {
			return a / b;
		}
	}
}