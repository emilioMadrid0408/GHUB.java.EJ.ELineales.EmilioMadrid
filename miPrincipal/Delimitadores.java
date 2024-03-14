package miPrincipal;

public class Delimitadores {

    public boolean evaluacionDelimitadores(String cadena) {

        Pila<String> pcaracteres = new Pila<String>();

        int i = 0;
        boolean maxElementosPorLeer = true;
        while (i < cadena.length() && maxElementosPorLeer) {
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch (car) {
                // En caso de apilar
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;

                case '[':
                    pcaracteres.apilar(charToString(']'));
                    break;

                case '{':
                    pcaracteres.apilar(charToString('}'));
                    break;

                case '/':
                    if (siguienteEsAsterisco(cadena, i)) {
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                case ')':
                case ']':
                case '}': {

                    String aux = pcaracteres.cima();
                    if (aux != null) {
                        if (s.compareTo(aux) == 0) {
                            // hay correspondencia por lo tanto son iguales y lo elimino
                            pcaracteres.retirar();
                        } else {
                            maxElementosPorLeer = false;
                        }
                    }

                }
                case '*':
                    if (siguienteEsDiagonal(cadena, i)) {
                        pcaracteres.retirar();
                        i++;
                    }
                default:
                    break;
            }
        }
        if (pcaracteres.esVacia() && maxElementosPorLeer)
            return true;
        else

            return false;

    }

    // Convierte un cahr a un objeto toS
    public static String charToString(char ch) {
        return String.valueOf(ch);
    }

    private static boolean siguienteEsAsterisco(String cadena, int posicion) {
        char car = cadena.charAt(posicion);
        if (car == '*')
            return true;
        else
            return false;
    }

    private static boolean siguienteEsDiagonal(String cadena, int posicion) {
        char car = cadena.charAt(posicion);
        if (car == '/')
            return true;
        else
            return false;
    }
}