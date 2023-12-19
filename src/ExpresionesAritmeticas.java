import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        Stack<Integer> datos = new Stack<>();
        String valores = "5 1 2 + 4 * + 3 -"; //14
        char dato;
        int n1,n2,n3, aux;
        for (int i = 0; i < valores.length(); i++) {
            dato = valores.charAt(i);
            if(Character.isDigit(dato)){
                aux = Integer.parseInt(""+dato);
                datos.push(aux);
            }else if(dato != ' '){
                if(datos.size()==1){
                    System.out.println(datos.peek());
                }else if(datos.isEmpty()){
                    System.out.println("ERROR");
                }else{
                    n2 = datos.peek();
                    datos.pop();
                    n1 = datos.peek();
                    datos.pop();
                    n3 = aritmetica(n1,n2,dato);
                    //System.out.println(n1+" "+n2);
                    datos.push(n3);
                    //System.out.println(n3);
                }
            }
        }
        if(datos.size()==1){
            System.out.println(datos.peek());
        }
    }

    public static int aritmetica(int n1,int n2,char operacion){
        int resultado = 0;
        try{
            switch (operacion){
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    resultado = n1 / n2;
                    break;
                default:
                    System.out.println("Operación no valida");
            }
        }catch (ArithmeticException e){
            System.out.println("ERROR");
            System.exit(0);
        }
        return resultado;
    }
}
