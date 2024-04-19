package Files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class File02 {
    public static void main (String[] args) {
        FileWriter file = null;
        PrintWriter printWriter = null;

        try {
            file = new FileWriter("C:\\Users\\AndyLópezRey\\Documents\\Programación\\IntelliJ\\Java\\TestingStuff\\filename.txt");
            printWriter = new PrintWriter(file);

            for (int i = 0; i < 10; i ++) printWriter.println("Printed line nº " + i);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != file) file.close();
            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }
}
