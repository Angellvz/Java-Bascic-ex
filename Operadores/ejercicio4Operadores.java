import java.util.Scanner;
public class ejercicio4Operadores {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double suma;
        double cuadrado;

        System.out.println("Programa que calcula el cuadrado de una suma: ");
        System.out.println("Escriba un numero: ");
        double a= sc.nextDouble();
        System.out.println("Escriba otro numero: ");
        double b = sc.nextDouble();

            suma=a+b;
            cuadrado=Math.pow(suma, 2);

        System.out.println("El cuadrado de la suma de los numeros que ingresaste es: "+cuadrado);
        sc.close();
    }
}
