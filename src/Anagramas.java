import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Anagramas {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("archivos/1.txt"));
        String line;
        while ((line = reader.readLine())!=null) {
            //Trabajar con line
            System.out.println(line);
        }
        reader.close();
    }
}
