package hw5;

public class MyRectangleMain {
    public static void main(String[] args) {
    	MyRectangle r2=new MyRectangle();
    	r2.setWidth(10f);
    	r2.setDepth(20f);
    	System.out.println(r2.getArea());
    	
    	
    	
    	System.out.println("===========");
    	MyRectangle r1= new MyRectangle(10f, 20f);
    	System.out.print(r1.getArea());
    }
}
