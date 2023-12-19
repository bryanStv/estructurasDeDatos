import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrecuency {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivos/LastnameFrequencies.csv"));
            String datos, Napellidos,apellidos, numeros;

            String[] tabla;
            Map<String, String> paises = new HashMap<>();
            Scanner tc = new Scanner(System.in);

            while ((datos = reader.readLine())!=null) { //leyendo palabras
                tabla = datos.split(",");
                if(tabla.length == 2) {
                    apellidos = tabla[0];
                    Napellidos = tabla[1];
                    Napellidos = Napellidos.replaceAll("\\.", "");
                    numeros = paises.putIfAbsent(apellidos, Napellidos);
                }
            }
            if(paises.isEmpty()){
                System.out.println("el fichero está vacío");
            }

            reader.close();
            /*for (String claves: paises.keySet()) {
                numeros = paises.get(claves);
                System.out.println(claves+" --> "+numeros);
            }*/

            while(true){
                System.out.print("Dime un apellido: ");
                String clave = tc.nextLine();
                if(clave.equals("")){
                    tc.close();
                    System.exit(0);
                }
                System.out.println(paises.get(clave));
            }

        }catch (IOException e){
            System.out.println("El fichero no existe.");
        }
    }
}
