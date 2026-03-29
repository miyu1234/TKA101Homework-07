package hw4;

public class p1_1 {
	
	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		
		int x[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int sum = 0;//先找total
		for (int i =0; i<x.length;i++) {
			sum += x[i];
		}
		
		//System.out.println("total:" + (sum));
		//所有元素的平均值
		int avg = sum/(x.length);
		System.out.println("所有元素的平均值" + (avg));
		
		//大於平均值的元素
				System.out.println("大於平均值的元素 : ");
		for (int i = 0; i <x.length;i++) {
			int num = x[i]; 
			outer:
			if (num<avg) {
				break outer;
			}else {
				System.out.print(x[i]+" ");
			}
		
		}
			
	}


//	(提示:陣列,length屬性)
}
