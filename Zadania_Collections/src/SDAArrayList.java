import java.lang.reflect.Type;
import java.util.Arrays;

public class SDAArrayList <T> {
    private Object[] array;

    public SDAArrayList() {
        array = new Object[1];
    }

    public boolean add(T element){
        if(array[array.length-1]!=null){
            increaseSize();
        }
        array[array.length-1]=element;

        return true;
    }

    //[12, 23, 53, 53, 77]
    //[12, 23, 53, 77]
    public boolean remove(T element){
        boolean isRemoved = false;
        for(int i=0; i< array.length; i++){
            if(array[i].equals(element)){
                //kopiuje tablice array do nowej tablicy tymczasowej skracajac jej dlugosc
                //[12, 23, 53]
                Object[] arrayTemporary = Arrays.copyOf(array,array.length-1);

                //w petli for kopiuje sobie pozostale elementy
                for(int j=i; j<arrayTemporary.length; j++){
                    arrayTemporary[j]=array[j+1];
                }

                array=arrayTemporary;
                i--;
                isRemoved=true;
            }
        }

        return isRemoved;
    }

    public T get(int index){
        //rzutujemy Object na typ generyczny T
        //zawsze mozemy to zrobic poniewaz tylko obiekty typu T dodawalismy do tej tablicy
        return (T) array[index];
    }

    public void display(){
        System.out.print("{");
        int ind=0;
        for(Object s:array){
            if(ind++<array.length-1){
                System.out.print(s+", ");
            } else {
                System.out.print(s);
            }
        }
        System.out.println("}");
    }

    private void increaseSize(){
//        Object[] arrayTemporary = new Object[array.length+1];
        array=Arrays.copyOf(array,array.length+1);
    }
}
