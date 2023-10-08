public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double r) {
        super(r);
    }

    @Override
    public void resize(int percent) {
        r=r*percent/100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "r=" + r +
                '}';
    }
}
