package com.deloitte.main;

class Point{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		
		return x+","+y;
	}
	@Override
	public boolean equals(Object target) {
		
		if(target!=null) {
			if(target instanceof Point) {
				
				Point point = (Point) target;
				if(x==point.x && y==point.y) {
					return true;
				}
			}
		}
		return false;
	}
}

public class MainClass {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2, 4);
		Point p2 = new Point(2, 4);
		String str;
		
		str = "X & Y : " + p1;
		System.out.println(str);
		
		System.out.println(p1.equals(p2));
	}

}
