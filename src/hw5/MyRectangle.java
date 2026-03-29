package hw5;

public class MyRectangle {
	public double width;
	public double depth;
	
	void setWidth(double width){
		this.width=width;//: 將收到的引數指定給width屬性
	}
	void setDepth(double depth){
		this.depth=depth;//: 將收到的引數指定給depth屬性
	}
	double getArea(){// 能計算該長方形的面積
		double area = width*depth;
		return area;
	}
	
	
	public MyRectangle(){ //MyRectangle()建構子建立物件
	
	}

	public MyRectangle(double width, double depth) {//傳入的兩個引數會指定給對應的屬性
		this.width= width;
		this.depth= depth;
}
}

