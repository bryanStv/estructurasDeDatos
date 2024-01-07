import java.util.*;

public class Botin {
    public static void main(String[] args) {
        //OK
        //System.out.println(repartir(2,10,20,50,200,500));
        System.out.println(repartir(3, 50, 20, 100, 200, 500, 10, 50));
    }

    public static String repartir(int participantes,Integer ...billetes){
        Map<Integer,String> botin = new HashMap<>();
        List<Integer> l = new ArrayList<>(Arrays.asList(billetes));
        //System.out.println(Arrays.toString(billetes));
        //Para qué los barajas?
        Collections.shuffle(l);
        //System.out.println(l.toString());
        //participantes
        for(int i = 0; i < participantes;i++){
            botin.put(i,"");
        }
        //reparto 0 --> lider
        int contadorParticipantes = 0;
        while(!l.isEmpty()){
            botin.put(contadorParticipantes, botin.get(contadorParticipantes)+l.get(0)+" ");
            l.remove(0);
            contadorParticipantes++;
            //Recuerda que cuando el índice debe quedar en un rango se usa el resto de la división
            // if(contadorParticipantes==participantes){
            //     contadorParticipantes = 0;
            // }
            contadorParticipantes = contadorParticipantes % participantes;
        }
        return botin.toString();
    }
}
