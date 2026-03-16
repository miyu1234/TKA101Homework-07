package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {
	
	public static void main(String[] args) {
		System.out.println("阿文..你最討厭哪個數字?");
		Scanner sc= new Scanner(System.in);
	 	
	 	int hate = sc.nextInt();
	 	int count =0;//紀錄跳了幾次
	 	int [] pool = new int[44];
	 	
		for (int i = 1; i<=49; i++) {
			 if((i/10 != hate ) && ( i % 10 !=hate )) { //找阿文討厭的數字
			 	 count++; //跳了1次
				 System.out.print(i + " ");	
				 pool[count-1] = i;
				 	if(count%6==0) { //每6次就一次換行
				 	System.out.println("");
				 	}	
			 }

			 }		
		System.out.println("總共有"+count+"個數字可以選");
		
	//==========================處理pool
		int[]finalpool = Arrays.copyOf(pool, (count));
		int pl = finalpool.length;
//		System.out.println("length"+ pl); //檢查

		
//	========luckypool============
		int[] lucky = new int[6];//隨6
		
		outer:
		for (int i = 0; i<=5;i++) {
			int ran= (int)(Math.random()*pl);	
			
			for(int y=0;y<=5;y++) {
			if(lucky[y]==finalpool[ran]) { //每index檢查

				i--;
				//System.out.println(lucky[y]+"重複了 "+(i-1)+"index");
				continue outer;
			}else {
;
				

			}				
			
		}lucky[i]=finalpool[ran];
		}
//		==============列印隨機6位========
		System.out.println("以下隨機六碼");
		for(int i =0;i<=5;i++) {
			System.out.print(lucky[i]+" ");
			
		}
		
			
		}
	
	}


	
	
	

