package test01;

import java.util.Scanner;

public class RunSquare {
	
	public static void main(String[] agrs) {
		Square square = new Square();
		square.Input();
		square.showEdge();
		square.caculateperimeter();
		square.caculateArea();
		square.showAll();
	}

}
