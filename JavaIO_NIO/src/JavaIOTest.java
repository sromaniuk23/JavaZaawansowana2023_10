import java.io.*;

public class JavaIOTest {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOinput.txt";
        String outputPath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOoutput.txt";


        //program kopiujacy zawartosc pliku wejsciowego do pliku wyjsciowego
//        try {
//            FileInputStream in = new FileInputStream(inputPath);
//            FileOutputStream out = new FileOutputStream(outputPath);
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }

//        try (FileReader in = new FileReader(inputPath);
//             FileWriter out = new FileWriter(outputPath);)
//        {
//            int nextChar;
//            while ((nextChar = in.read()) != -1) {
//                System.out.println((char)nextChar);
//                out.append((char) nextChar);
//            }
//
//            out.flush();
//        } catch (Exception e){
//            e.printStackTrace();
//        }


        try {
            BufferedReader in = new BufferedReader(new FileReader(inputPath));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputPath));

            String line;
            while ((line = in.readLine()) != null) {
                out.write(line+"\n");
            }

            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
