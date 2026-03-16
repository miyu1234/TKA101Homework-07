package hw2;

//輸出九九乘法表

public class TestNineNine {
	public static void main(String[] args) {
//		使用for迴圈 + while迴圈
//		int x;
//
//		for (x=1;x<=9; x++) {
//			int y=1;
//			while (y<10) {
//				System.out.print(x + "*"+ y + "=" + (x*y)+" ");
//				y++;
//			}
//			System.out.println();
//		}
		
		//================//
		
		//二：使用for迴圈 + do while迴圈
//		 int x;
//		 for (x=1;x<=9; x++) {
//			 int y=1;
//			 do {
//				 System.out.print(x + "*"+ y + "=" + (x*y)+" ");
//				 y++;
//			 }while(y<=9);
//			 System.out.println();
//		 }
		
		//===================//
		
		//三：使用while迴圈 + do while迴圈
		int x=1;
		while (x<10) {
		 
			 int y=1;
			 do {
				 System.out.print(x + "*"+ y + "=" + (x*y)+" ");
				 y++;
			 }while(y<=9);
			 
			 System.out.println();
			 x++;
		}
	
	
	}
	
}
