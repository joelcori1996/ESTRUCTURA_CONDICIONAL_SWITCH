
package programas;
import java.util.Scanner;
 
public class Ejercicio4 {
    
       public static void main(String[] args) 
       {

        int numero;
        String Mensaje;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el numero : ");
        numero = lectura.nextInt();
        switch (numero) {
            
            case 1: Mensaje = "El periodo es: Mensual";break;
            case 2: Mensaje = "El periodo es: Bimestral";break;
            case 3:Mensaje = "El periodo es: Trimestral";break;
            case 4: Mensaje = "El periodo es: Cuatrimestral";break;
            case 6: Mensaje = "El periodo es: Semestral";break;
            case 12: Mensaje = "El periodo es: Anual";break;
            default: Mensaje = "No es un periodo";break;
        }
        
        System.out.println(Mensaje);

    }
    
}
