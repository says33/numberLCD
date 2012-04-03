import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: saysrodriguez
 * Date: 02/04/12
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class numeros {

    public static ArrayList<String> linea1 = new ArrayList<String>();
    public static ArrayList<String> linea2 = new ArrayList<String>();
    public static ArrayList<String> linea3 = new ArrayList<String>();
    public static ArrayList<String> linea4 = new ArrayList<String>();
    public static ArrayList<String> linea5 = new ArrayList<String>();

    public static void numeros(){
        linea1.add(" ---  ");
        linea1.add("| ");
        linea1.add("  ---   ");
        linea1.add("  ---   ");
        linea1.add("  | 	 | ");
        linea1.add("  ---  ");
        linea1.add("   ---  ");
        linea1.add("  ---  ");
        linea1.add("  --- 	 ");
        linea1.add("  ---  ");

        linea2.add("|   | ");
        linea2.add("| ");
        linea2.add("     |  ");
        linea2.add("     |  ");
        linea2.add("  |    | ");
        linea2.add(" |     ");
        linea2.add("  |     ");
        linea2.add("     | ");
        linea2.add(" |   |  ");
        linea2.add(" |   | ");

        linea3.add("|   | ");
        linea3.add("| ");
        linea3.add("  ---   ");
        linea3.add("  ---   ");
        linea3.add("   ----| ");
        linea3.add("  ---  ");
        linea3.add("   ---  ");
        linea3.add("     | ");
        linea3.add("  ---   ");
        linea3.add("  ---  ");

        linea4.add("|   | ");
        linea4.add("| ");
        linea4.add(" |      ");
        linea4.add("     |  ");
        linea4.add("       | ");
        linea4.add("     | ");
        linea4.add("  |   | ");
        linea4.add("     | ");
        linea4.add(" |   |  ");
        linea4.add("     | ");

        linea5.add(" ---  ");
        linea5.add("| ");
        linea5.add("  ---   ");
        linea5.add("  ---   ");
        linea5.add("       | ");
        linea5.add("  ---  ");
        linea5.add("   ---  ");
        linea5.add("     | ");
        linea5.add("  ---  ");
        linea5.add("  --- ");

    }

    public static void convertirNumerosPatalla(String cadena){
        int indiceCorrida = 0;
        String numeroLcd1 = "";
        String numeroLcd2 = "";
        String numeroLcd3 = "";
        String numeroLcd4 = "";
        String numeroLcd5 = "";
        char caracter;
        int valor;


        while (cadena.length() > indiceCorrida){
            numeros();

            caracter = cadena.charAt(indiceCorrida);
            valor = Integer.parseInt(String.valueOf(caracter));

            numeroLcd1 += linea1.get(valor);
            numeroLcd2 += linea2.get(valor);
            numeroLcd3 += linea3.get(valor);
            numeroLcd4 += linea4.get(valor);
            numeroLcd5 += linea5.get(valor);
            indiceCorrida++;
        }
        System.out.println(numeroLcd1);
        System.out.println(numeroLcd2);
        System.out.println(numeroLcd3);
        System.out.println(numeroLcd4);
        System.out.println(numeroLcd5);

    }
}
