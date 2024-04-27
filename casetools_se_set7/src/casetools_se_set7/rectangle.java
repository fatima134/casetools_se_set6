package casetools_se_set7;

public class rectangle {
	private double width;
	private double height;
	public  rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double getwidth() {
		return width;
		
	}
	public void setwidth(double width) {
		this.width=width;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height=height;
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
	}
	public double getArea() {
		return width*height;
	}
	public double getperimeter() {
		return 2* (width+height);
	}
}












