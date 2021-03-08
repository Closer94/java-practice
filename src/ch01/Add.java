package ch01;
import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;

		System.out.print("Input num1: ");
		x = input.nextInt();

		System.out.print("Input num2: ");
		y = input.nextInt();

		sum = x / y;
		System.out.println(sum);
		System.out.println("result = " + x / y);
		
		input.close();
	}
}