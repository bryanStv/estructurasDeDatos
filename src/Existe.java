import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Existe {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Scanner tc = new Scanner(System.in);
        System.out.print("Elemento a buscar: ");
        int n = tc.nextInt();
        tc.close();
        if(existe(lista,n)){
            System.out.printf("El elemento %d está en %s",n,lista.toString());
        }else{
            System.out.printf("El elemento %d no está en %s",n,lista.toString());
        }
    }

    public static boolean existe(List<Integer> lista,int item){
        if(lista.contains(item)) return true;
        else return false;
    }
}
