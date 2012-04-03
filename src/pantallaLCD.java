/**
 * Created by IntelliJ IDEA.
 * User: saysrodriguez
 * Date: 02/04/12
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
public class pantallaLCD extends numeros{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String numero = "";
        for (;;){
            try{
                System.out.println("Ingrese un numero: ");
                numero = scanner.nextLine();
                convertirNumerosPatalla(numero);
            }catch (NumberFormatException e){
                System.out.println("Error de Sintaxis");
            }
        }
    }

}
