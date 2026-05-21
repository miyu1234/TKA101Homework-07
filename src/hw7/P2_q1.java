package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P2_q1 {

	public static int ran() {
		int ranNum;
		ranNum = (int) (Math.random() * 1000 + 1);
		return ranNum;
	}

	public static void main(String[] args) {
		String fileName = "Data.txt";
		int x = 0;
		try (FileWriter fw = new FileWriter(fileName, true); BufferedWriter bw = new BufferedWriter(fw)) {
			while (x <= 10) {
				x++;
				int num = ran(); //不做這個的話 存進去的跟Console show的會不一樣 
				bw.write(num + " ");
				System.out.print(num + " ");
			}
			bw.newLine();
			System.out.println("completed");
		} catch (IOException e) {

			System.err.println("寫入檔案時發生錯誤：" + e.getMessage());
			e.printStackTrace();
		}
	}

}
