/*
9. Leer dos números y realizar la división mediante restas mostrando el cociente y el resto.
 */
package cocientenumero;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class CocienteNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num_uno;
        int num_dos;
        int resta = 0;
        int contador = 1;
        num_uno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa a numero"));
        num_dos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa b numero"));

        do {
            resta = num_uno - resta;
            contador++;

        } while (contador <= num_dos);
        System.out.println("Producto es : " + resta);

    }

}
