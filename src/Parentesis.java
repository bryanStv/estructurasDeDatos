import java.util.EmptyStackException;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        //OK
        String parentesis = "{([])}[{}]{}";
        try {
            Stack<Character> pila = new Stack<>();
            char palabra;

            for (int i = 0; i < parentesis.length(); i++) {
                palabra = parentesis.charAt(i);

                if (cerrado(palabra) && pila.isEmpty()) {
                    System.out.println("Está mal parentizado");
                    System.exit(0);
                } else if (abierto(palabra)) {
                    pila.push(palabra);
                } else if (cerrado(palabra)) {
                    if(comprobacion(palabra,pila.peek(),pila)){
                        pila.pop();
                    }
                }
            }
            if(pila.isEmpty()){
                System.out.println("Está bien parentizada");
            }else{
                System.out.println("Está mal parentizado");
            }
        }catch(EmptyStackException e){
            System.out.println("La pila está vacía");
        }
    }

    public static boolean abierto(char palabra){
        return palabra == '{' || palabra == '[' || palabra == '(';
    }
    public static boolean cerrado(char palabra){
        return palabra == '}' || palabra == ']' || palabra == ')';
    }

    public static boolean comprobacion(char palabra, char palabraPila,Stack<Character> pila) throws EmptyStackException{
        palabraPila = pila.peek();
        if(palabra == ')'){
            // if(palabraPila == '(') return true;
            // else return false;
            return palabraPila == '(';
        }else if(palabra == ']'){
            // if(palabraPila == '[') return true;
            // else return false;
            return palabraPila == '[';
        }else if(palabra == '}'){
            // if(palabraPila == '{') return true;
            // else return false;
            return palabraPila == '{';

        }else return false;
    }
}
