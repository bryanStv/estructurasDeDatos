import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        //Ok
        ArrayList<Integer> alturas = new ArrayList<>();
        int numero = numeroAlumnos();
        leerAlturas(alturas,numero);
        mostrarResultados(alturas,calcularMedia(alturas));
    }
    public static int numeroAlumnos(){
        Scanner tc = new Scanner(System.in);
        System.out.print("Dime el número de alumnos: ");
        int numero = tc.nextInt();
        return numero;
    }

    public static void leerAlturas(ArrayList<Integer> resultado,int numeroAlumnos){
        Scanner tc = new Scanner(System.in);
        for(int i = 1; i <= numeroAlumnos;i++){
            System.out.print("Dime la altura del alumno "+i+": ");
            resultado.add(tc.nextInt());
        }
    }

    public static double calcularMedia(ArrayList<Integer> alturas){
        int suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);
        }
        return suma/(double)alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Integer> alturas){
        int suma = 0;
        double media = calcularMedia(alturas);
        for(int altura: alturas){
            if(altura > media){
                suma++;
            }
        }
        return suma;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Integer> alturas){
        int suma = 0;
        double media = calcularMedia(alturas);
        for(int altura: alturas){
            if(altura < media){
                suma++;
            }
        }
        return suma;
    }

    public static void mostrarResultados(ArrayList<Integer> alturas,double media){
        System.out.println(alturas.toString());
        System.out.println("media: "+media);
        System.out.println("Altura superior: "+calcularAlumnosAlturaSuperior(alturas));
        System.out.println("Altura inferior: "+calcularAlumnosAlturaInferior(alturas));
    }
}
