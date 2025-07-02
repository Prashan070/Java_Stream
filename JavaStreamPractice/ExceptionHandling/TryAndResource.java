package JavaStreamPractice.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;


public class TryAndResource {

    public static void normalTryRes() {
     /*   FileReader fr = null;

        try {
            fr = new FileReader("file.txt");
        } catch (IOException e) {

        } finally {
            if (fr != null) {
                try {
                    fr.close();// must close manually
                } catch (IOException e) {

                }
            }
        }*/

        try (FileReader fr = new FileReader("file.txt")) {

        } catch (IOException e) {
            System.out.println("not found");
        }


    }

    public static void main(String[] args) {
        TryAndResource.normalTryRes();

    }
}
