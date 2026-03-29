package hw4;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		System.out.println("請輸入年月日");
		Scanner sc = new Scanner(System.in);
        int y = sc. nextInt();//年
        int m = sc.nextInt();//月
        int d = sc.nextInt();//日
               
        
        //算閏平年
        int md [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};//平年
        
        if((y%4 == 0 && y%100 != 0) || (y % 400 == 0)) { 
        	//true is 閏年
        	md[2]= 29; //閏年是29days
                }
        if (m<1|| m>12|| d<0 || d>md[m] ) {
        	System.out.println("輸入錯誤,請輸入正確日期");
        }else {
        	output(md, m ,d);
        }
       
        
	}
    
public static void output(int []md, int m, int d){
	int countm = 0;
    for (int i=1; i<m; i++) {
    	countm += md[i];
    }
    System.out.print("輸入日期為該年的第"+ (countm+d) + "天");
}
	
	
}




