package class_;

import frame.Options;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Button_design implements MouseListener {

    private final Options view;

    public Button_design(Options view) {
        this.view = view;
        events();
    }

    public final void events() {
        view.button_employee.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_employee)) {
            changeAparence(view.panel_employe, new Color(11,61,138));
                
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_employee)) {
            changeAparence(view.panel_employe, new Color(23,93,163));
                
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.button_employee)) {
            changeAparence(view.panel_employe, new Color(27,105,188));
            
        }
  
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_employee)) {
            changeAparence(view.panel_employe, new Color(23,93,163));        
        }
    }

    private void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
