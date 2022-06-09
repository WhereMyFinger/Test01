package test01;

import java.util.Scanner;

public class Exercise01 {
	
	public static void caculateDelta(int a, int b, int c) {
		int delta = b*b - 4*a*c;
		
		if(delta >= 0) System.out.println("Can bac 2 cua delta: " + Math.sqrt(delta));
		else System.out.println("delta nho hon 0");
	}
	
	public static void main(String[] agrs) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		caculateDelta(a, b, c);
	}

}
