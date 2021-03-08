package ch01;

public class P69Test {
	public static void main(String[] args) {
		String a = "hello";
		String b = "Hello";
		String c = "940602-1603618";
		
		System.out.println(b.substring(2, 4));
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(c.charAt(7) == '1' ? "남":"여");		
		System.out.println(c.length());
		
	}
}
