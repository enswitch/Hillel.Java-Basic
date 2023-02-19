package homeworks.hm15;

public class PointTest extends  Point{

    public PointTest(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(1,2);
        point2.setCoordinateX(2);
        point2.setCoordinateY(3);
        Point point3 = new Point(5, 7);

        distanceBetweenPoints(point1, point3); // two parameters
        point1.distanceBetweenPoints(point3); // with one parameter (works but incorrectly!)

        System.out.println(point1.equals(point2)); // overriding equals works
        System.out.println(point1.equals(point3)); // the same

        Point point4 = (Point) point3.clone(); // overriding clone works, but here is repeating of throws in method clone and method main
        System.out.println(point4.toString()); // overriding to string works

        Point point5 = new Point(point4); // copy constructor works
        System.out.println(point5.toString());





    }
}
