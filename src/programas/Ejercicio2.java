
package programas;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        int numero;
        String Mensaje;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el numero del 1-10 : ");
        numero = lectura.nextInt();
        switch (numero) {
            case 1: Mensaje = "El numero romano es: I";break;
            case 2:Mensaje = "El numero romano es: II";break;
            case 3:Mensaje = "El numero romano es: III";break;
            case 4: Mensaje = "El numero romano es: IV"; break;
            case 5: Mensaje = "El numero romano es: V";break;
            case 6:Mensaje = "El numero romano es: VI";break;
            case 7:Mensaje = "El numero romano es: VII";break;
            case 8:Mensaje = "El numero romano es: VIII";break;
            case 9: Mensaje = "El numero romano es: IX";break;
            case 10: Mensaje = "El numero romano es: X";break;
            default:
                Mensaje = "El numero no esta en el sistema";
                break;
        }
        System.out.println(Mensaje);
    }
}
