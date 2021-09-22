package com.company;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public Point3d (Point3d a, Point3d b) {
        xCoord = b.getX() - a.getX();
        yCoord = b.getY() - a.getY();
        zCoord = b.getZ() - a.getZ();
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX (double val) {
        xCoord = val;
    }
    public void setY (double val) {
        yCoord = val;
    }
    public void setZ (double val) {
        zCoord = val;
    }
    public boolean compare (Point3d other) {
        return (xCoord == other.getX()) && (yCoord == other.getY()) && (zCoord == other.getZ());
    }
    public double distanceTo (Point3d other) {
        return java.lang.Math.sqrt(java.lang.Math.pow(other.getX() - xCoord, 2.0) + java.lang.Math.pow(other.getY() - yCoord, 2.0) + java.lang.Math.pow(other.getZ() - zCoord, 2.0));
    }
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        Point3d vectorAB = new Point3d(a, b);
        Point3d vectorAC = new Point3d(a, c);
        return vectorAB.vectorProduct(vectorAC).distanceTo() * 0.5;

    }
    public Point3d vectorProduct(Point3d other) {
        return new Point3d(yCoord * other.getZ() - zCoord * other.getY(), zCoord * other.getX() - xCoord * other.getZ(), xCoord * other.getY() - yCoord * other.getX());
    }
    public double distanceTo() {
        return distanceTo(new Point3d());
    }
    public static boolean compare2 (Point3d a, Point3d b, Point3d c) {
        return a.compare(b) || b.compare(c) || c.compare(a);
    }
}
