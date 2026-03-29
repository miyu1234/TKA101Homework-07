package hw5;
//利用Overloading,
//設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])
//可以找出二維陣列的最大值並回傳
public class p2 {
 public static void main(String[] args) {
	 int [][]intArray = {
			 {1,6,3},
			 {9,5,2}
	 };
	 double [][] doubleArray = {
			 {1.2 , 3.5 , 2.2},
			 {7.4 , 2.1 , 8.2 }
	 };
	 
	 p2 p = new p2();
	 System.out.println(p.maxElement(intArray));
	 System.out.println(p.maxElement(doubleArray));
	 
 }
 
 public int maxElement(int x[][]) {
	 int max = x[0][0];
	 for  (int i =0; i<2;i++) {
		 for (int y = 0; y<3; y++) {
			 if (max<x[i][y]) {
				 max = x[i][y];
			 }
			 
		 }
	 }
	 
	 return max;
 }
 
 public double maxElement(double x[][]) {
	 double max = x[0][0];
	 for  (int i =0; i<2;i++) {
		 for (int y = 0; y<3; y++) {
			 if (max<x[i][y]) {
				 max = x[i][y];
			 }
			 
		 }
	 }
	 return max;
 }
 
 
 
}
