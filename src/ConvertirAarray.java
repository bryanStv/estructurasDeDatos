import java.util.ArrayList;
import java.util.Arrays;

public class ConvertirAarray {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 1; i <= 20;i++){
            lista.add(i);
        }
        System.out.println(lista.toString());
        int[] vector = new int[lista.size()];
        for(int i = 0;i < vector.length;i++){
            vector[i] = lista.get(i);
        }
        System.out.println(Arrays.toString(vector));
    }
}
