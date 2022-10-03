import javax.swing.JOptionPane;

public class sentenciaSwitch {
    public static void main(String[] args) {
        int dato;

        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato entre 1 y 5: "));

        switch(dato){// comos los elif en python
            case 1: JOptionPane.showMessageDialog(null, "El numero es 1: ");
                break;//sale del switch al cumplir la condicion --case
            case 2: JOptionPane.showMessageDialog(null, "El numero es 2: ");
                break;
            case 3: JOptionPane.showMessageDialog(null, "El numero es 3: ");
             break;
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4: ");
                 break;
            case 5: JOptionPane.showMessageDialog(null, "El numero es 5: ");
                break;
            default: JOptionPane.showMessageDialog(null, "Escribe un numero del 1 al 5: ");//como el else en un if
        }

    }
}
