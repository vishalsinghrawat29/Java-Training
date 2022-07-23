import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Write Data to file
        String data = "I love India";
        try{
            FileOutputStream fos = new FileOutputStream("myFile.txt");
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            fos.close();
        }catch (IOException ex){
            System.out.println(ex);
        }

        //Read Data from File
        try {
            FileInputStream fis = new FileInputStream("myFile.txt");

            // while ( data != -1)
            int i = 0;
            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }
            fis.close();
        }catch (IOException x){
            System.out.println(x);
        }
    }
}