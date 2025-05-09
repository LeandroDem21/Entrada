import javax.swing.JOptionPane;
public class Entrada{
    public static void main(String[]args){
        String nombreUsuario= JOptionPane.showInputDialog("Ingresa tu nombre");
        String apellidoUsuario= JOptionPane.showInputDialog("Ingresa tu primer apellido");
        String apellidoUsuario2= JOptionPane.showInputDialog("Ingresa tu segundo apellido");
        System.out.println("Tu nombre completo es:" +nombreUsuario+ " " +apellidoUsuario+ " " +apellidoUsuario2);
    }
}