import java.util.ArrayList;
import java.util.Scanner;
public class AL{
  public static int cantidadAlumnos(){
    Scanner sc = new Scanner(System.in);
    int cant = 0;
    do{
      System.out.println("Numero de alumnos: ");
      cant =sc.nextInt();
    } while (cant <1);
    return cant; 
  }
  public static void readAl(ArrayList<Double>arr, int n){
    Scanner sc=new Scanner(System.in);
    int i;
    double ps;
    for (i=1;  i<=n; i++){
      do{
        System.out.print("Alumno "+ i +" altura: ");
        ps=sc.nextDouble();
      } while (ps <=0);
      arr.add(ps);
      }
    }
    public static double calcularMedia(ArrayList<Double> arr){
        double media= 0;
         for (Double temp: arr){
         media =media+temp;
    }
    return media/arr.size();
  }
  public static void mostrarResultados(ArrayList<Double> arr, double media){
    int superior = 0, inferior = 0;
    System.out.println("Alturas: ");
    System.out.println(arr);
    for (Double temp : arr){
      if (temp > media)
         superior++;
      else if (temp < media)
            inferior++;
    } 
    System.out.printf("Media: %.2f %n",media );
    System.out.println("Hay "+superior+"alumnos con mas estatura que la media");
    System.out.println("Hay "+inferior+"alumnos con menos estatura que la media");
  }
}