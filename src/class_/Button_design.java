package class_;

import frame.Options;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Button_design implements MouseListener {

    boolean pressed_add_e = false;
    boolean pressed_eli_e = false;
    boolean pressed_add_s = false;
    boolean pressed_eli_s = false;
    private final Options view;

    public Button_design(Options view) {
        this.view = view;
        events();
    }

    public final void events() {
        view.button_add_employee.addMouseListener(this);
        view.button_eliminate_employee.addMouseListener(this);
        view.button_add_sale.addMouseListener(this);
        view.button_eliminate_sale.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_add_employee)) {
            changeAparence(view.panel_add_employee, new Color(11, 61, 138));

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));
            changeAparence(view.panel_add_sale, new Color(23, 93, 163));
            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
            pressed_add_e = true;
            pressed_eli_e = false;
            pressed_add_s = false;
            pressed_eli_s = false;
        }
        if (evt.equals(view.button_eliminate_employee)) {
            changeAparence(view.panel_eliminate_employee, new Color(11, 61, 138));

            changeAparence(view.panel_add_employee, new Color(23, 93, 163));
            changeAparence(view.panel_add_sale, new Color(23, 93, 163));
            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
            pressed_add_e = false;
            pressed_eli_e = true;
            pressed_add_s = false;
            pressed_eli_s = false;
        }
        if (evt.equals(view.button_add_sale)) {
            changeAparence(view.panel_add_sale, new Color(11, 61, 138));

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));
            changeAparence(view.panel_add_employee, new Color(23, 93, 163));
            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
            pressed_add_e = false;
            pressed_eli_e = false;
            pressed_add_s = true;
            pressed_eli_s = false;
        }
        if (evt.equals(view.button_eliminate_sale)) {
            changeAparence(view.panel_eliminate_sale, new Color(11, 61, 138));

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));
            changeAparence(view.panel_add_sale, new Color(23, 93, 163));
            changeAparence(view.panel_add_employee, new Color(23, 93, 163));
            pressed_add_e = false;
            pressed_eli_e = false;
            pressed_add_s = false;
            pressed_eli_s = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.button_add_employee) && !pressed_add_e) {
            changeAparence(view.panel_add_employee, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_eliminate_employee) && !pressed_eli_e) {

            changeAparence(view.panel_eliminate_employee, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_add_sale) && !pressed_add_s) {

            changeAparence(view.panel_add_sale, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_eliminate_sale) && !pressed_eli_s) {

            changeAparence(view.panel_eliminate_sale, new Color(27, 105, 188));
        }

    }

    @Override
    //Acccion al quitar el mouse
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_add_employee) && !pressed_add_e) {
            changeAparence(view.panel_add_employee, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_eliminate_employee) && !pressed_eli_e) {

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_add_sale) && !pressed_add_s) {

            changeAparence(view.panel_add_sale, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_eliminate_sale) && !pressed_eli_s) {

            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
        }
    }

    private void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
