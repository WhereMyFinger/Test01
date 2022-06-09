package test01;

import java.util.Scanner;

public class Square {
	
	private float edge;
	
	public void Input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh hinh vuong: ");
		edge = scanner.nextFloat();
	}
	
	public void showEdge() {
		System.out.println(edge);
	}
	
	public void caculateperimeter() {
		float c;
		c = edge * 4;
		System.out.println("chu vi hinh vuong la: " + c);
	}
	
	public void caculateArea() {
		float s;
		s = (float) Math.pow(edge, 2);
		System.out.println("Dien tich hinh vuong la: " + s);
	}
	
	public void showAll() {
		showEdge();
		caculateArea();
		caculateArea();
	}

}
