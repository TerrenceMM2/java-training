package org.tm;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perimeter = 0;
		int area = 0;
		int height = 1;
		int width = 1;
		
		while (height < 11) {
			System.out.printf("%-10s | %-10s | %-10s | %-10s\n", "WIDTH", "HEIGHT", "PERIMETER", "AREA");
			System.out.println("---------------------------------------------------------------------");
			width = 1;
			while (width < 11) {
				perimeter = (height + width) * 2;
				area = height * width;
				System.out.printf("%-10d | %-10d | %-10d | %-10d\n", width, height, perimeter, area);
				width++;
			}
			height++;
		}
	}

}
