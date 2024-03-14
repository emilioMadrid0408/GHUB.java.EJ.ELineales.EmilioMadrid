package miPrincipal;
import java.util.Scanner;
public class Principal{  
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("***********************");
            System.err.println("  Estructuras Lineales ");
            System.out.println("***********************");
            System.out.println(" 1) Pila");
            System.out.println(" 2) Stack");

            System.out.println();

            System.out.println("0) Salir");
            System.out.print("Selecciona opción:");
            opc = consola.nextInt();
            switch (opc) {
                case 1:
                    DemoPila.menu();
                    break;

                case 2:
                    DemoStack.menu();
                    break;
                case 0:
                    System.out.println("ADIOS!");
                    consola.close();
                    break;
                default:
                    System.out.println("Valor incorrecto, intente de nuevo");
                    break;
            }

        }while (opc !=0);

        
    }
}