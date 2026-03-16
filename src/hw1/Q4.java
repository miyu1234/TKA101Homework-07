package hw1;
	//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class Q4 {
	public static void main (String[] arg) {
		final double pi = 3.1415;
		int radius = 5;
		
		double area = pi * Math.pow(radius , 2);
		double Circumference = pi * radius *2;
		
		
		System.out.printf(radius + "的圓面積是 = %.2f",area);
		System.out.printf("與圓周長 = %.2f", Circumference);
	}
}
