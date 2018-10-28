import javax.swing.JOptionPane;

public class SaludoJPane {
    public static void main(String[] args) {

        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Bienvenido "+nombre);

    }
}