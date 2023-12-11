import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        paises.put("España","Madrid");
        paises.put("Francia","París");
        paises.put("Belgica","Bruselas");

        Scanner tc = new Scanner(System.in);
        System.out.print("Dime un país: ");
        String pais = tc.next();
        System.out.println(paises.getOrDefault(pais,"No se ha encontrado ese país en la lista."));
        tc.close();
    }
}
