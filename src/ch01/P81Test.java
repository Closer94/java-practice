package ch01;
class P81Test {
	public static void main(String args[]) {
		f(6);
	}

	static void f(int i) {
		if (i % 2 == 0)
			System.out.println("짝수");
		if (i % 3 == 0) {
			System.out.println("3의 배수");
			System.out.println("i = " + i);
		}
		if (i % 5 == 0)
			System.out.println("5의 배수");
		else if (i % 5 == 1)
			System.out.println("5의 배수 + 1");
		else
			System.out.println("5의 배수 + 2 혹은 3 혹은 4");
	}
}