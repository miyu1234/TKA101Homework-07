package hw2;

public class p3_q1 {
	public static void main(String[] args) {
		
		int count ;//column
		int times; //row
		for(count=0; count<=5 ;count++) {
			char word = 'A';	//固定每次大迴圈都回到A
			for (times=1; times<=count;times++) { //負責row 只會生count的次數

				System.out.print(word);
				word++; 
			}
			System.out.println();
			
	}
}
}

	 	
