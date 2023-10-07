public class CW1 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(2.0f, 3.0f);

        System.out.println(point2D1);
        System.out.println(point2D1.getX());

        Point3D point3D = new Point3D();

        System.out.println(point3D);

        Point2D point = new Point3D(2.0f, 3.0f, 4.0f);

        float xYvalues[] = point.getXY();
        System.out.println(xYvalues[0]);
        System.out.println(xYvalues[1]);
    }
}
