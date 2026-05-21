package hw6;




public class Calculator {

	
private int x ;
private int y;
	
	public Calculator() {
		
	}
	public Calculator(int x, int y) throws CalException {//傳入的length會指定給對應的屬性
		setter(x , y);

	}

	int getx(){
		return x;
	}
	
	int gety(){
		return y;
	}
	
	
	int powerXY(int x, int y) throws CalException{
		setter(x, y);
		return (int) Math.pow(x, y);
		
	
	}
	void setter(int  x , int y) throws CalException{
		
		try {
		if(x>0 && y<0) {
			System.out.println("次方為負數,結果回傳不為整數");
		}else if(x ==0|| y==0) {
			System.out.println("0的0次方是沒有意義的!");
//		}else if (x instanceof String){
//			throw new CalException("輸入格式不正確");
		}else {
			this.x= x;
			this.y= y;
		}
	}
	}

	
}
