public class CW7 {
    final static Resizable resizable = new ResizableCircle(3);

    public static void main(String[] args) {
        System.out.println(resizable);

        resizable.resize(150);

        System.out.println(resizable);

        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getArea());
        resizableCircle.resize(200);
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getArea());

//        resizable = new ResizableCircle(5.0);
    }
}
