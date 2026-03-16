package hw3;

import java.util.Scanner;

public class q1_1 {
	public static void main(String[] args) {
		
		int [] side = getNumb(); 
		int c1 = side [0]; //第一下
		int c2 = side [1]; //第二下
		int c3 = side [2]; //第三下
			
		
		if (c1+c2<c3 || c1+c3<c2 || c2+c3<c1) {
			System.out.println("不是三角形");
		}else if (c1==c2&& c2==c3 ) {
			System.out.println("正三角形");
		}else if(c1==c2 || c2==c3 || c1==c3){
			System.out.println("等腰三角形");
		}else if ((Math.pow(c1, 2) + Math.pow(c2, 2) == Math.pow(c3, 2)) || 
		         (Math.pow(c1, 2) + Math.pow(c3, 2) == Math.pow(c2, 2)) || 
		         (Math.pow(c2, 2) + Math.pow(c3, 2) == Math.pow(c1, 2))){
			System.out.println("直角三角形");
		}else if  (c1!=c2||c2!=c3||c1!=c3){
			System.out.println("其他三角形");
	}
	}
	
	public static int[] getNumb() {
		System.out.println("請輸入三個整數");
		Scanner sc= new Scanner(System.in);
		
		int[] numb = new int[3]; //num的陣列
		for(int x=0;x<3;x++) {//迴圈3次 
			numb[x]= sc.nextInt();// 拿輸入的數字
		}
		
		return numb;
	}

	
	}
