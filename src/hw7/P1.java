package hw7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
 public static void main(String[] args) throws IOException {
     int i;
     int wordcount = 0;
     int linecount = 0;
     try {
    	 File f1 = new File("src/hw7/Sample.txt");
    	 
         String str;
         FileReader fr = new FileReader("src/hw7/Sample.txt");
         BufferedReader br = new BufferedReader(fr) ;
         while ((i = fr.read()) != -1) {
        	 wordcount ++;}
         String str2;
         FileReader fr2 = new FileReader("src/hw7/Sample.txt");
         BufferedReader br2 = new BufferedReader(fr2) ;
         while ((str2 = br2.readLine()) != null) {
             linecount++;
             }
         System.out.println("Sample.txt檔案共有"+f1.length()+ "個位元組" + wordcount +"個字元" + linecount+ "列資料");
         br.close();   
         fr.close();
     } catch(IOException e){
    	 System.out.println("發生錯誤：讀取檔案失敗！");
         e.printStackTrace();
     }
     
}
}