package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;

public class ctrlRegistro implements MouseListener{
    
    frmRegistro Vista;
    
    public ctrlRegistro(frmRegistro vista){
        this.Vista = vista;
        
        Vista.btnRegistrar.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.btnRegistrar){
            //1-Validar campos vacios
            if(Vista.txtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(Vista, "Llene los campos");
            }
            
            //2-Validar correos
            if(!Vista.txtCorreo.getText().contains("@") || !Vista.txtCorreo.getText().contains(".com")){
                JOptionPane.showMessageDialog(Vista, "Ingrese un correo valido");
            }
            
            //3-Validar que la contraseña tenga mas de 6 caracteres
            if(Vista.txtContraseña.getText().length() < 6){
                JOptionPane.showMessageDialog(Vista, "La contraseña debe tener mas de 6 caracteres");
            }
            
            //4-Validar que la edad solo ingrese numeros
            try {
                int edadNumerica = Integer.parseInt(Vista.txtEdad.getText());
                if(edadNumerica > 100 || edadNumerica == 0){
                    JOptionPane.showMessageDialog(Vista, "Ingrese una edad valida");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Vista, "Ingrese solo numeros");
            }
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
