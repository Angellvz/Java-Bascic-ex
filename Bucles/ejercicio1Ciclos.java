import javax.swing.JOptionPane;

public class ejercicio1Ciclos {
    public static void main(String[] args) {

        int numero, cuadrado;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero>=0){

            cuadrado=(int)Math.pow(numero,2);// si ponemos (int) lo transformamos a entero
            JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es: "+cuadrado);

            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"No se debe ingresar numeros negativos ps chicho: ");
    }
}
