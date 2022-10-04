import java.util.Scanner;

public class ejercicio3Operadores {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float calificacionFinal;
        float criterio1=0.1f;
        float criterio2=0.25f;
        float criterio3=0.4f;

        System.out.println("Calificacion final-Curso Informatica");

        System.out.println("Ingrese la nota de su participacion: ");
        float participacionNota = sc.nextFloat();

        System.out.println("Ingres nota de su primer parcial: ");
        float firstParcial = sc.nextFloat();

        System.out.println("Ingrese nota de su segundo parcial: ");
        float secondParcial = sc.nextFloat();

        System.out.println("Ingrese nota de su examen final: ");
        float examenFinal = sc.nextFloat();

        calificacionFinal = (participacionNota*criterio1)+(firstParcial*criterio2)+(secondParcial*criterio2)+(examenFinal*criterio3);

        System.out.println("Lsu calificacion final de acuerdo al criterio de evalucacion es: "+calificacionFinal);
        sc.close();
        //resolucion alternativa
        //participacionNota*=0.1f;
        //firstParcial*=0.25f;
        //secondParcial*=0.25f;
        //examenFinal*=0.4f;
        //calificacion=participacionNota + firstParcial + secondParcial + examenFinal
    }
}
