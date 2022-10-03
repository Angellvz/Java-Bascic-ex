import javax.swing.JOptionPane;

public class ejercicio2Condicionales {
    public static void main(String[] args) {
        float dscto=0.2f;
        float dsctototal;
        float pagoTotal;
        float compra=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de su compra: "));

        if(compra>300){
            dsctototal=compra*dscto;
            pagoTotal=compra-dsctototal;
            JOptionPane.showMessageDialog(null, "Usted obtuvo un descuento del 20% por lo que su pago final sera: " +pagoTotal);
        }
        else{
            JOptionPane.showMessageDialog(null, "Su pago sera:"+compra);
        }
    }
}
