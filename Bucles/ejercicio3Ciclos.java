import javax.swing.JOptionPane;

public class ejercicio3Ciclos {
    public static void main(String[] args) {
        int number, count=0;

        number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros positivos"));

        while(number>0){
            number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero "));
            count++;
        }
        JOptionPane.showMessageDialog(null, "Solo se permite numeros positivos");
        JOptionPane.showMessageDialog(null, "Se ingresaron: "+count+" numeros positivos" );

    }
}
