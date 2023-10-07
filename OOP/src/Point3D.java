public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super(); //wywolujemy konstruktor bezargumentowy z klasy nadrzednej Point2D
        z=0.0f; //tutaj pole z nie jest niczym przesloniete -> dlatego nie ma potrzeby uzycia "this"
    }

    public Point3D(float x, float y, float z) {
        super(x, y); //wywolujemy konstruktor dwuargumentowy z klasy nadrzednej Point2D
        this.z = z; //inicjalizacja z, z uzyciem slowa kluczowego this, bo argument metody z przesłania pole z klasy
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ(){
        return new float[]{this.x, this.y, this.z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getWhatUWant(){
        return this.y; //pole y jest dostepne w klasie dziedziczacej bo jest protected w klasie Point2D
    }

    public double getBiggerValue(){
        return 2*super.getValue(); //super przenosi nam kontekst wywolania na klase bazowa
    }

    @Override
    public String toString() {
        return String.format("(%7.3f; %d; %f)",x,(int)y,z);
    }
}
