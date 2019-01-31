
import java.io.*;

public class TP2 {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/jop/Dropbox/study/Gestão de redes/TP3/containership-images.txt");

        BufferedReader brTest = new BufferedReader(new FileReader(file));
        String text = brTest .readLine();
        System.out.println("Firstline is : " + text);
        }
}
