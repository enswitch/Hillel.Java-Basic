package homeworks.hm15;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " +
                "x =" + x +
                ", y =" + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point other = (Point) o;
        if (!Objects.equals(x, other.x)) return false;
        if (!Objects.equals(y, other.y)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static int distanceBetweenPoints(Point a, Point b) {
        int result = (int) Math.sqrt((b.y - a.y) * (b.y - a.y) + (b.x - a.x) * (b.x - a.x));
        if (a == null || b == null) {
            throw new IllegalArgumentException("Create point with whole numbers only!");
        } else if (a.x == b.x && a.y == b.y) {
            System.out.println("Points have the same coordinates");
        } else {
            System.out.println("The distance between points is: " + result);
        }
        return result;
    }

    public int distanceBetweenPoints(Point p) {
        return Point.distanceBetweenPoints(this, p);
    }
}
