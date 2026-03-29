package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height)
//當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class p1_q1 {
	public static void main(String[] args) {
		System.out.println("輸入寬與高 會給你一個方塊唷");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		starSquare(w,h);
	}
	
	
	public static void starSquare(int width, int height) {
		for (int x =1; x<=height ; x++) {
			for(int y =1;y<=width; y ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	
}
