import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        //OK
        Map<String,Integer> telefonos = new HashMap<>();
        telefonos.put("Pepito",123456789);
        telefonos.put("Jaimito",987654321);
        telefonos.put("Empresaurio",123789456);

        Scanner tc = new Scanner(System.in);
        System.out.print("Dime un nombre: ");
        String nombre = tc.next();
        System.out.println(telefonos.getOrDefault(nombre,-1));
        tc.close();
    }
}
