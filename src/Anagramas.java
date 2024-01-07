import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args){
        //OK
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivos/1.txt"));
            String palabra,alfabetica = "";
            Map<String, ArrayList<String>> anagramas = new HashMap<>();
            ArrayList<String> lista = new ArrayList<>();
            while ((palabra = reader.readLine())!=null) { //leyendo palabra
                alfabetica = alfabetizar(palabra);
                lista = anagramas.get(alfabetica);
                if(lista == null){
                    lista = new ArrayList<>();
                    lista.add(palabra);
                    anagramas.put(alfabetica, lista);
                }else{
                    lista.add(palabra);
                    anagramas.put(alfabetica,lista);
                }
            }
            if(lista.isEmpty()){
                System.out.println("el fichero está vacío");
            }
            reader.close();
            int minGroupSize = 2;
            for (String claves: anagramas.keySet()) {
                lista = anagramas.get(claves);
                if(lista.size() >= minGroupSize) {
                    System.out.println(claves + "-->" + anagramas.get(claves));
                }
            }
        }catch (IOException e){
            System.out.println("El fichero no existe.");
        }
    }
    public static String alfabetizar(String line){
        char[] c = line.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
