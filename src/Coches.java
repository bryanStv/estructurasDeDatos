import java.util.ArrayList;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("Volvo");
        coches.add("Seat");
        coches.add("Fiat");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        for(String coche : coches){
            System.out.println(coche);
        }
        System.out.println("Hola Mundo");
    }
}
