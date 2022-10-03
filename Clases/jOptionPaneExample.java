import javax.swing.JOptionPane;//se importa para poder usar las ventanas emergentes de java

public class jOptionPaneExample {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena=JOptionPane.showInputDialog("Digite una frase: ");//usando esto importa automaticamente el jOptionPane-Entrada de datos
        entero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));

        JOptionPane.showMessageDialog(null,"La frase es: "+cadena);//Para salida de datos
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
    }
}
