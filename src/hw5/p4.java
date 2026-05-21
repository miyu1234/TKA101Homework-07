package hw5;

public class p4 {
	public static void main(String[] args) {
		
		System.out.println("本次隨機產生驗證碼為:" );
		System.out.println( genAuthCode());
		
	}
	
	public static String genAuthCode() {
		String pool = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		//System.out.println(pool.length() ); //62
		String Authcode = "";
		

		 for (int i=0;i<8;i++) {
			int ran = (int)(Math.random()*pool.length());
			Authcode += pool.charAt(ran);
				
		 }
			 
		
		return Authcode;
	}
}
