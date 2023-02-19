package homeworks.hm15;

import java.util.Objects;

public class Point implements Cloneable {
    private int coordinateX;
    private int coordinateY;

    public Point(Point point) {
        this.coordinateX = point.coordinateX;
        this.coordinateY = point.coordinateY;
    }

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "Point: " +
                "x =" + coordinateX +
                ", y =" + coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point other = (Point) o;
        if (!Objects.equals(coordinateX, other.coordinateX)) return false;
        if (!Objects.equals(coordinateY, other.coordinateY)) return false;
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static int distanceBetweenPoints(Point a, Point b) {
        int result = (int) Math.sqrt((b.coordinateY - a.coordinateY) * (b.coordinateY - b.coordinateY)
                + (b.coordinateX - a.coordinateX) * (b.coordinateX - a.coordinateX));
        System.out.println("The distance between points is: " + result);
        return result;
    }


    public int distanceBetweenPoints(Point p) {
        int result = (int) Math.sqrt((p.coordinateY - this.coordinateY) * (p.coordinateY - this.coordinateY)
                + (p.coordinateX - this.coordinateX) * (p.coordinateX - this.coordinateX));
        System.out.println("The distance between points is: " + result);
        return result;

    }
}
