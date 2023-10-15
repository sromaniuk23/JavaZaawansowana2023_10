import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class JavaIOSerialization {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\serializedObject.txt";

        SerializableClass serializableClass1 = new SerializableClass(1.23f, 30, "firstObject");
        SerializableClass serializableClass2 = new SerializableClass(2.46f, 60, "secondObject");

        List<SerializableClass> serializableClasses = new LinkedList<>();
        serializableClasses.add(serializableClass1);
        serializableClasses.add(serializableClass2);

        //zapis obiektu do pliku poprzez jego serializacje
        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath))){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serializableClasses);
        } catch (IOException e){
            e.printStackTrace();
        }

        //odczyt zserializowanego obiektu z pliku
        try(FileInputStream fileInputStream = new FileInputStream(new File(filePath))){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<SerializableClass> serializableClassesFromFile = (List<SerializableClass>) objectInputStream.readObject();
            System.out.println(serializableClassesFromFile);
        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }


    }
}
