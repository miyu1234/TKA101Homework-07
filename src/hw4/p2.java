package hw4;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		int id[]= {25,32,8,19,27};//編號
		int cash[]= {2500,800,500,1000,1200};//現金
		
		Scanner sc = new Scanner(System.in);
        System.out.println("阿文，你想借多少錢？ ");
        int want = sc.nextInt();//輸入想借的錢錢
		
        int count = 0;//總人數
        
        System.out.print("有錢可以借的員工編號:");
        for (int i=0; i<5;i++ ) {
        	int money = cash[i];
        	if (money>= want) {
        		System.out.print(id[i]+" ");
        		count++;
        	}
        }
        //共幾人
        System.out.print("共"+count+"人");
        
	}

}
