package homeworks.hm15;

public class PointTest extends Point {

    public PointTest(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(1, 2);
        point2.setX(2);
        point2.setY(3);
        Point point3 = new Point(5, 7);

        Point point4 = (Point) point3.clone();
        System.out.println("Cloned point by method clone: " + point4.toString());

        Point point5 = new Point(point4);
        System.out.println("Cloned point by constructor clone: " + point5.toString());

        distanceBetweenPoints(point3, point5);
        point1.distanceBetweenPoints(point3);

        System.out.println("Are objects equals? " + point3.equals(point5));
        System.out.println("Are objects equals? " + point3.equals(point2));


    }
}
