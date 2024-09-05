
package programas;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero;
        String Mensaje;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el numero del 1 - 5: ");
        numero = lectura.nextInt();
        switch (numero) {
            case 1:Mensaje = "El numero en letra es : Uno";break;
            case 2:Mensaje = "El numero en letra es : Dos"; break;
            case 3: Mensaje = "El numero en letra es : Tres";break;
            case 4: Mensaje = "El numero en letra es : Cuatro";break;
            case 5:Mensaje = "El numero en letra es : Cinco"; break;
            default:
                Mensaje = "El numero no esta en el sistema";
                break;
        }
        System.out.println(Mensaje);
    }
}
