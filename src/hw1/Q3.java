package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class Q3 {
	public static void main(String[] args) {
		int day;
		int hour;
		int total_hour;
		int min;
		int total_min;
		int sec;
		
		int q3 = 256559;
		
		sec = q3% 60;
		total_min = q3/60;
		total_hour=total_min/60;
		day = total_hour/24;
		
		hour=total_hour%24;
		min=total_min%60;
		
		System.out.println("256559秒為"+day+"天"+hour+"小時"+min+"分"+sec+"秒");
		
	}
}
