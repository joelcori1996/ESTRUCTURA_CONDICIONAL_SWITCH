
package programas;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {

        int numero;
        String Mensaje;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el numero : ");
        numero = lectura.nextInt();
        switch (numero) 
        {
            case 1:Mensaje = "One";break;
            case 2:Mensaje = "Two";break;
            case 3:Mensaje = "Three";break;
            case 4:Mensaje = "Four"; break;
            case 5: Mensaje = "Five";break;
            case 6: Mensaje = "Six";break;
            default:
                Mensaje = "El numero no esta en el sistema";
                break;
        }

        System.out.println(Mensaje);

    }
}
