import java.util.Scanner;// java.util, Scanner es una clase que nos permite obtener la entrada de datos primitivos
public class entradaDeDatos {
    public static void main(String[] args) {
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido
        Scanner entrada = new Scanner(System.in);
        float numero;//define tipo de variable-aunque puede definirse en la  misma linea codigo que se guarda la variable

        System.out.println("Digite un numero");
         numero=entrada.nextFloat();// entrada de una cadena/ se guarda el dato

        System.out.println("El numero es: "+numero);

        entrada.close();
    }

}
