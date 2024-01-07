import java.util.*;

public class TerminacionLoteria {
    public static void main(String[] args) {
        //Ok
        List<String> numeros = Arrays.asList("00004","03847","39804");
        System.out.println(repetidos(numeros));
        List<String> numeros2 = Arrays.asList("58975", "25894", "52985", "98598");
        System.out.println(repetidos(numeros2));
    }

    public static Map<Character,Integer> repetidos(List<String> numeros){
        Map<Character,Integer> repetidos = new HashMap<>();
        for(int i = 0; i < numeros.size();i++){
            char terminacion = numeros.get(i).charAt(numeros.get(i).length()-1);
            //repetidos.put(terminacion , repetidos.get(terminacion) == null ? 1 : repetidos.get(terminacion)+1);
            Integer cuantos = repetidos.get(terminacion);
            if (cuantos == null)
                repetidos.put(terminacion, 1);
            else
                repetidos.put(terminacion, ++cuantos);
        }
        return repetidos;
    }
}
