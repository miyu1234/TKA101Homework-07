package hw4;

public class p1_3 {
	public static void main(String[] args) {
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		String star8[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
			
		//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		int count = 0;
			for (int i =0; i <star8.length;i++) {//8組loop
				for (int x = 0; x <star8[i].length();x++) {//各組loop一次
					char t = star8[i].charAt(x); // t是當下抽取的文字
					if ( t== 'a' ||t== 'e' ||t=='i' || t=='o' || t=='u') {//if條件
						System.out.print(t);
						count++;
											}
				}
			}
		System.out.println(count);
	}

}
