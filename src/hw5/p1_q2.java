package hw5;
//請設計一個方法為randAvg()
//從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class p1_q2 {
	public static void main(String[] args) {
		System.out.println("本次亂數結果:");
		randAvg();

	}
	
	public static void randAvg() {
		int rannum[]= new int[10];//放10個隨機數
		int total=0;
		for (int x= 0;x<10;x++) {
		rannum[x] = (int)(Math.random() *100)+1;
		System.out.print(rannum[x] + " ");
		total+=rannum[x];
		}
		System.out.println("");
		System.out.println("平均值:" + (total/10));

	}
	
}
