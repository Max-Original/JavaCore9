package javacore9;

public class Application {
public static void main(String[] args) throws IllegalAccessException, MyException {
	
	Methods first = new Methods(0,2);
	Methods second = new Methods(1,2);
	Methods third = new Methods(0,0);
	Methods four = new Methods(2,1);
	
	first.addition();
	second.division();
	third.multiplication();
	four.subtraction();
	
}
}
