package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P2_q2 {
	public static void copyFile(String copyFrom, String copyTo) throws IOException {
		File copyfrom = new File(copyFrom + ".txt");
		File copyto = new File(copyTo + ".txt");

		FileInputStream in = new FileInputStream(copyfrom);
		FileOutputStream out = new FileOutputStream(copyto);
		int c; // 用來暫存每次讀到的 1 個位元組(byte)資料；read() 回傳 int 是為了能用 -1 表示結尾

		while ((c = in.read()) != -1) { // 每次讀 1 byte；讀到檔案尾端時 read() 會回傳 -1，所以就停止迴圈
			out.write(c); // 把剛剛讀到的那個 byte 原封不動寫到輸出檔案 → 完成「複製」
			
			
		}
		System.out.print("完成複製"); // 立刻把緩衝區的內容輸出到螢幕，讓你即時看到
		in.close(); // 關閉輸入串流(把水管關起來)，釋放系統資源
		out.close(); // 關閉輸出串流，並把可能還在緩衝區的資料寫完
	}

	public static void main(String[] args) throws IOException {

		String copyFrom = "Data";
		String copyTo = "Data2";
		copyFile(copyFrom, copyTo);

	}

}
