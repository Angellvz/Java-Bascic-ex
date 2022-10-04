import java.util.Scanner;

public class ejercicio1Operadores {
    public static void main(String[] args) {

        double suma;
        double average;


        Scanner sc= new Scanner(System.in);
        System.out.println("------Programa que calcula la suma y promedio de 3 notas----- ");
        System.out.println("Ingrese su primera nota: ");
        Double firstN= sc.nextDouble();
        System.out.println("Ingrese su segunda nota: ");
        Double secondN= sc.nextDouble();
        System.out.println("Ingrese su tercera nota: ");
        Double thirdN= sc.nextDouble();

        suma=firstN+secondN+thirdN;
        average=suma/3;
        
        System.out.println("La suma de sus notas es: "+ suma);
        System.out.println("El promedio de sus notas es "+average);
        sc.close();
    }
}
