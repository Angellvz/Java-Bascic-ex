import javax.swing.JOptionPane;
//programa que indica si el numero ingresado es positivo o negativo
public class ejercicio2Ciclos {
    public static void main(String[] args) {
        double number;

        number=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));

        while(number !=0){
            if(number>0){
                JOptionPane.showMessageDialog(null,"El numero es positivo");
            }
            else if(number<0){
                JOptionPane.showMessageDialog(null,"El numero es negativo");
            }

            number=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
        JOptionPane.showMessageDialog(null, "0 es numero neutro ps chicho");
    }

}
