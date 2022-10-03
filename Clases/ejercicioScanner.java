// Programa Java para leer datos de varios tipos usando la clase Scanner

import java.util.Scanner;

public class ejercicioScanner
{
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
            // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);
             // entrada de una cadena
        System.out.println("Ingrese su nombre: ");
            String name = sc.nextLine();

            // entrada de un carácter
        System.out.println("Ingrese su genero  M/F: ");
            char gender = sc.next().charAt(0);//guarda el primer caracter que encuentre

        // Entrada de datos numéricos
            // byte, short y float
        System.out.println("Ingrese su edad: ");
            int age = sc.nextInt();
        System.out.println("Ingrese su telefono: ");
            long mobileNo = sc.nextLong();
        System.out.println("Ingrese su promedio: ");
            double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Teléfono: "+mobileNo);
        System.out.println("Promedio: "+average);
        sc.close();
    }
}