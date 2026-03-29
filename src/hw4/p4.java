package hw4;

public class p4 {
	public static void main(String[] args) {
		
		int exam[] []= { //[x][y]
		{10,35,40,100,90,85,75,70},
		{37,75,77,89,64,75,70,95},
		{100,70,79,90,75,70,79,90},
		{77,95,70,89,60,75,85,89},
		{98,70,89,90,75,90,89,90},
		{90,80,100,75,50,20,99,75}
		};
		
		int hs[]= new int [8];//最好成績紀錄榜(紀錄第X次是誰最高分)
		int scount[]= new int[8];//如果是他第一就++
		
		for(int x=0; x<6;x++) {
			int ehs = 0;//紀錄
			for (int y =0;y<8;y++) {
				int pk = exam[x][y];//當下同學的分[0][0] 
				if (pk>ehs) {//如果當下的分比紀錄高分大
					ehs = pk; //加入紀錄
					hs[x]=y; //把學號加到最好成績紀錄榜
				}//if end
			}	//小for end
		}//大for end
		
		for (int i=0;i<6;i++) {
			int who = hs[i];//第[0]次是[3]號同學第一
			scount[who]++;//所以scount[3]++
			
		}//第幾X次的最高分同學放到 各同學的最高分次數count
		
		for (int i =0; i<8;i++) {
			System.out.println("第"+( i+1) + "同學拿到" + scount[i]+ "次最高分"  );
		}
		 
	}//main end
}
