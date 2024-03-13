package miPrincipal;
import java.util.Stack;
public class DemoStack {

public static void main(String[] args) {
    Stack<Integer> pila = new Stack<Integer>();

    //Apilamos algunos elementos
    pila.push(2);
    pila.push(6);
    pila.push(7);

    System.out.println("El tope de la pila es: "+pila.peek());

    //Desapilamos elementos
    pila.pop();
    System.out.println("El tope de la pila es: "+pila.peek());
    pila.pop();
    System.out.println("El tope de la pila es: "+pila.peek());
    pila.pop();
    System.out.println("El tope de la pila es: "+pila.peek());
}
    
}