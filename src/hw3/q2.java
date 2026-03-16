package hw3;

import java.util.Scanner;

public class q2 {
 public static void main(String[] args) {
	 
	 //產生random數
	 int bonus = (int)(Math.random()* 101);
	System.out.println(bonus+"開始猜數字吧");
	
	guess(bonus);//把 random的數丟進去guess去比較
	
 }
 
 public static void guess(int target) { //target就是丟進去的數字
	 
 	Scanner sc= new Scanner(System.in);
 	
 	int num = sc.nextInt();//num 是用猜的
 	
 	outer:
 	while(target!=num) {//如果不對直接進入無限迴圈
 		
 		if (target<num && target!=num) {	
 			System.out.println("猜錯了! 答案比較小喔");
			num = sc.nextInt();
			continue outer; //錯了就回去outer

 		} else if (num < target) {
            System.out.println("猜錯了! 答案比較大喔");
			num = sc.nextInt();
			continue outer; //錯了就回去outer
        }

 	}
 		System.out.print("答對了!答案就是"+ (target)); //沒有中target!=num的迴圈

 	}
 
}
