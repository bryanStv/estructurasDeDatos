import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//ft Adrián
public class PapaNoel {
    public static void main(String[] args) {
        List<Integer> portales = new ArrayList<>();
        portales.add(2);
        portales.add(4);
        portales.add(7);
        System.out.println(visita(3,portales));
    }

    public static String visita(int aterriza,List<Integer> portales){
        String resultado = "";
        int aux = Integer.MAX_VALUE;
        int distancia = 0;
        int portal = 0;
        int compara = 0;
        while(!portales.isEmpty()) {
            aux = Integer.MAX_VALUE;
            for (int i = 0; i < portales.size(); i++) {
                distancia = Math.abs(portales.get(i) - aterriza);
                if(aux == distancia){
                    if(portales.get(i) > portales.get(compara)){
                        portal = i;
                        aux = distancia;
                        compara = portal;
                    }else{
                        portal = compara;
                        aux = distancia;
                        compara = portales.get(portal);
                    }
                }
                if(aux > distancia){
                    portal = i;
                    aux = distancia;
                    compara = portal;
                }else if(portales.size()==1){
                    portal = i;
                }
            }
            aterriza = portales.get(portal);
            resultado += portales.get(portal)+" ";
            portales.remove(portal);
        }
        return resultado;
    }
}
