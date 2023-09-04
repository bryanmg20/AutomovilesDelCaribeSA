package class_;


import frame.eliminate_sale;
import frame.file_employee;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class file implements MouseListener {

    //verifican si el boton esta seleccionado para seleccionar el color acordado
    public final file_employee emp;

    public file(file_employee emp) {
        this.emp = emp;
        events();
    }

    public final void events() {
        emp.n_min.addMouseListener(this);
        emp.n_max.addMouseListener(this);
        emp.s_min.addMouseListener(this);
        emp.s_max.addMouseListener(this);
        emp.c.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
         Object evt = e.getSource();
        if (evt.equals(emp.n_min)) {
            changeAparence(emp.panel_n_min, new Color(23, 93, 163));

        }
        if (evt.equals(emp.n_max)) {
            changeAparence(emp.panel_n_max, new Color(23, 93, 163));

        }
        if (evt.equals(emp.s_min)) {
            changeAparence(emp.panel_s_min, new Color(23, 93, 163));

        }
        if (evt.equals(emp.s_max)) {
            changeAparence(emp.panel_s_max, new Color(23, 93, 163));

        }
        if (evt.equals(emp.c)) {
            changeAparence(emp.panel_c, new Color(23, 93, 163));

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        
        Object evt = e.getSource();

        //cambio de color de los botones del menu
        if (evt.equals(emp.n_min)) {
            changeAparence(emp.panel_n_min, new Color(11, 61, 133));
        }
        if (evt.equals(emp.n_max)) {
            changeAparence(emp.panel_n_max, new Color(11, 61, 133));

        }
        if (evt.equals(emp.s_min)) {
            changeAparence(emp.panel_s_min, new Color(11, 61, 133));

        }
        if (evt.equals(emp.s_max)) {
            changeAparence(emp.panel_s_max, new Color(11, 61, 133));

        }
        if (evt.equals(emp.c)) {
            changeAparence(emp.panel_c, new Color(11, 61, 133));

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(emp.n_min)) {
            changeAparence(emp.panel_n_min, new Color(27, 105, 188));

        }
         if (evt.equals(emp.n_max)) {
            changeAparence(emp.panel_n_max, new Color(27, 105, 188));

        }
        if (evt.equals(emp.s_min)) {
            changeAparence(emp.panel_s_min, new Color(27, 105, 188));

        }
        if (evt.equals(emp.s_max)) {
            changeAparence(emp.panel_s_max, new Color(27, 105, 188));

        }
        if (evt.equals(emp.c)) {
            changeAparence(emp.panel_c, new Color(27, 105, 188));

        }

    }

    @Override
    //Acccion al quitar el mouse
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(emp.n_min)) {
            changeAparence(emp.panel_n_min, new Color(23, 93, 163));

        }
        if (evt.equals(emp.n_max)) {
            changeAparence(emp.panel_n_max, new Color(23, 93, 163));

        }
        if (evt.equals(emp.s_min)) {
            changeAparence(emp.panel_s_min, new Color(23, 93, 163));

        }
        if (evt.equals(emp.s_max)) {
            changeAparence(emp.panel_s_max, new Color(23, 93, 163));

        }
        if (evt.equals(emp.c)) {
            changeAparence(emp.panel_c, new Color(23, 93, 163));

        }
        
    }

    public void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
