import java.util.Scanner;


public class ejercio2Operadores {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float gananciaSemanal;

        System.out.println("---Programa que imprime salario semanal---");
        
        System.out.println("Ingrese las horas que trabajo en la semana: ");
        float horaTrabajadas= sc.nextFloat(); 
        System.out.println("Ingrese cuanto dinero se le paga por hora: ");
        float gananciaHora=sc.nextFloat();


        gananciaSemanal=horaTrabajadas*gananciaHora;

        System.out.println("Su ganancia semanal es de: "+gananciaSemanal+"$");

        sc.close();
    }
}
