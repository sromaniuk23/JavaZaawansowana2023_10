public class Point2D {
    protected float x;
    protected float y; //pole y jest dostepne dla klasy dziedziczacej, jest dostepne dla klasy Point2D
    //protected ma mniejsza dostepnosc niz public. Public jest dostepny nawet dla klas spoza pakietu
    double pi; //nie ma modyfikatora dostepu, to jaki mamy dostep?

    public Point2D() {
        x=0.0f;
        y=0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    protected double getValue(){
        return 3.14;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                 x +
                ", " + y +
                '}';
    }
}
