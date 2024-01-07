import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        //OK
        ArrayList<String> coches = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        String coche = "";
        do{
            System.out.print("Dime el coche a añadir: ");
            coche = tc.nextLine();
            coches.add(coche);
            if(coche.equals("")) break;
        }while(true);

        for(String coch : coches){
            System.out.println(coch);
        }
    }
}
