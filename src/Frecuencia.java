import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuencia {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String numeros;

        do {
            System.out.print("Introduce números escritos: ");
            numeros = tc.nextLine();
            if(numeros.isEmpty()){
                System.exit(0);
            }
            Map<String, Integer> resultado = new HashMap<>();
            String[] palabras = numeros.split(" ");
            for (int i = 0; i < palabras.length; i++) {
                Integer valor = resultado.get(palabras[i]);
                if(valor == null){
                    resultado.put(palabras[i], 1);
                }else {
                    resultado.put(palabras[i],valor + 1 );
                }
            }
            System.out.println(resultado);
        }while(true);
    }
}
