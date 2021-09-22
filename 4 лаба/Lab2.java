package com.company;
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
    	Scanner in_data = new Scanner(System.in);
    	double x;
    	double y;
    	double z;
    	System.out.println("Введите координаты первой точки: ");
    	x = in_data.nextDouble();
    	y = in_data.nextDouble();
    	z = in_data.nextDouble();
    	Point3d firstPoint = new Point3d(x, y, z);
		System.out.println("Введите координаты второй точки: ");
		x = in_data.nextDouble();
		y = in_data.nextDouble();
		z = in_data.nextDouble();
    	Point3d secondPoint = new Point3d(x, y, z);
		System.out.println("Введите координаты третей точки: ");
		x = in_data.nextDouble();
		y = in_data.nextDouble();
		z = in_data.nextDouble();
    	Point3d thirdPoint = new Point3d(x, y, z);
    	if (Point3d.compare2(firstPoint, secondPoint, thirdPoint)) {
    		System.out.println("Не может быть, 2 одинаковые точки!");
    		System.exit(0);
		}
    	System.out.println("Площадь треугольника = " + Point3d.computeArea(firstPoint, secondPoint, thirdPoint));
    }
}
