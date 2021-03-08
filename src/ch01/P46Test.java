package ch01;

public class P46Test {
	public static void main(String[] args) {
		int a = 10;
		double b;
		b = a; //upCasting
		System.out.println(b);
//		a = b; error 
		a = (int)b; //downCasting
		System.out.println(a);
		b = 10/3; //upCasting
		System.out.println(b);
		b = (int)10.2 + (int)3.3; //downCasting
		System.out.println(b);
		b = (int)10.2 + 3.3; //upCasting
		System.out.println(b);
	}
}
