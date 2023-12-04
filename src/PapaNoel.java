import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PapaNoel {
    public static void main(String[] args) {
        List<Integer> portales = new ArrayList<>();
        portales.add(2);
        portales.add(5);
        portales.add(1);
        System.out.println(visita(3,portales));
    }

    public static String visita(int aterriza,List<Integer> portales){
        String resultado = "";
        int aux = Integer.MAX_VALUE;
        int distancia = 0;
        int portal = 0;
        while(!portales.isEmpty()) {
            for (int i = 0; i < portales.size(); i++) {
                distancia = Math.abs(portales.get(i) - aterriza);
                if(aux > distancia){
                    portal = i;
                    aux = distancia;
                }else if(portales.size()==1){
                    portal = i;
                }
            }
            aterriza = portal;
            resultado += portales.get(portal)+" ";
            portales.remove(portal);
        }
        return resultado;
    }
}