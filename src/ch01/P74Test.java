package ch01;
import java.util.Scanner;

public class P74Test {
	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요: ");
		hours = sc.nextInt();
		if(hours > 0) {
			pay = hours * 9000;
			System.out.printf("임금은 %d 입니다. \n", pay);
		}else {
			System.out.println("시간이 잘못 입력되었습니다.");
		}
	}
}
