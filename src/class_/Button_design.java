package class_;

import frame.Options;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Button_design implements MouseListener {
    boolean pressed_e = false;
    private final Options view;

    public Button_design(Options view) {
        this.view = view;
        events();
    }

    public final void events() {
        view.button_add_employee.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_add_employee)) {
            changeAparence(view.panel_add_employe, new Color(11,61,138));
            pressed_e=true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.button_add_employee) && !pressed_e) {
            changeAparence(view.panel_add_employe, new Color(27,105,188));
        }
  
    }

    @Override
    //Acccion al quitar el mouse
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_add_employee) && !pressed_e) {
            changeAparence(view.panel_add_employe, new Color(23,93,163));        
        }
    }

    private void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
