package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入X的值:");
		int ix = sc.nextInt();
		System.out.println("請輸入Y的值:");		
		int iy = sc.nextInt();
		
		try {
			Calculator c1=new Calculator();

			System.out.print(ix + "的"+ iy + "次方等於" + c1.powerXY(ix,iy));
		} catch (CalException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		
		
	}
}
