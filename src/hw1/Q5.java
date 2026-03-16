package hw1;
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢
public class Q5 {
	public static void main(String[] args) {
		int PV = 1500000;//本金
		double r = 0.02;//利率
		int n = 10; //期數
		double FV = PV* ((double)(Math.pow((1+r),n)));
		
		System.out.printf("本金加利息共有 = %.1f",FV);
	}
}
