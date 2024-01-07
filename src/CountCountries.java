import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) {
        //OK
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivos/Colfuturo-Seleccionados.csv"));
            String datos, pais;
            Integer numero = 0;

            String[] tabla;
            Map<String, Integer> paises = new HashMap<>();

            reader.readLine();
            while ((datos = reader.readLine())!=null) { //leyendo palabras
                tabla = datos.split(",");
                pais = tabla[6];
                numero = paises.get(pais);
                if(numero == null){
                    paises.put(pais, 1);
                }else{
                    paises.put(pais,numero+1);
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
        }catch (IOException e){
            System.out.println("El fichero no existe.");
        }
    }
}
