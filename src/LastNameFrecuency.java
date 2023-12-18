import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LastNameFrecuency {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivos/LastnameFrequencies.csv"));
            String datos, Napellidos,apellidos, numeros;
            Integer numero = 0;

            String[] tabla;
            Map<String, Integer> paises = new HashMap<>();

            reader.readLine();
            while ((datos = reader.readLine())!=null) { //leyendo palabras
                tabla = datos.split(",");
                Napellidos = tabla[1];
                Napellidos.replaceAll("\\.", "");
                System.out.println(Napellidos);
                /*if(numero == null){
                    paises.put(Napellidos, 1);
                }else{
                    paises.put(Napellidos,numero+1);
                }
            }
            if(paises.isEmpty()){
                System.out.println("el fichero está vacío");
            }

            reader.close();
            for (String claves: paises.keySet()) {
                numero = paises.get(claves);
                System.out.println(claves+" --> "+numero+" alumnos");
            }

                 */
            }
        }catch (IOException e){
            System.out.println("El fichero no existe.");
        }
    }
}
