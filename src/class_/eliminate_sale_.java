package class_;


import frame.eliminate_sale;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class eliminate_sale_ implements MouseListener {

    //verifican si el boton esta seleccionado para seleccionar el color acordado
    public final eliminate_sale emp;

    public eliminate_sale_(eliminate_sale emp) {
        this.emp = emp;
        events();
    }

    public final void events() {
        emp.eliminar_ventas.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
         Object evt = e.getSource();
        if (evt.equals(emp.eliminar_ventas)) {
            changeAparence(emp.panel, new Color(23, 93, 163));

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        
        Object evt = e.getSource();

        //cambio de color de los botones del menu
        if (evt.equals(emp.eliminar_ventas)) {
            changeAparence(emp.panel, new Color(11, 61, 133));
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(emp.eliminar_ventas)) {
            changeAparence(emp.panel, new Color(27, 105, 188));

        }

    }

    @Override
    //Acccion al quitar el mouse
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(emp.eliminar_ventas)) {
            changeAparence(emp.panel, new Color(23, 93, 163));

        }
    }

    public void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
