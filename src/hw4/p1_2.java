package hw4;

public class p1_2 {
	public static void main (String[] args) {
		//請建立一個字串,經過程式執行後,輸入結果是反過來的
		//例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		String[] r = s.split("");
		
		int ll= r.length;

		for (int i = (ll-1); i>=0 ; i--) {
			System.out.print(r[i]);
		}
	
	}
	
	
}
