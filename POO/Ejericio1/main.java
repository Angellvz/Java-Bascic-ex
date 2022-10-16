import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    ArrayList<Double> altura = new ArrayList();
    int N;
    double media;
    N=AL.cantidadAlumnos();
    AL.readAl(altura, N);
    media=AL.calcularMedia(altura);
    AL.mostrarResultados(altura,media);
  }
}