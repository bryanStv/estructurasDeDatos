import java.util.*;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> telefonos = new HashMap<>();
        telefonos.put("Pepito", Arrays.asList(123456789,991));
        telefonos.put("Jaimito",Arrays.asList(112,856));
        telefonos.put("Empresaurio",Arrays.asList(123,321));

        Scanner tc = new Scanner(System.in);
        System.out.print("Dime un nombre: ");
        String nombre = tc.next();
        System.out.println(telefonos.getOrDefault(nombre,null));
        tc.close();
    }
}