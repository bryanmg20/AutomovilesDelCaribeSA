package class_;

import frame.Options;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Button_design implements MouseListener {
    //verifican si el boton esta seleccionado para seleccionar el color acordado
    boolean employee = false;
    boolean sale = false;
    boolean graphique = false;
    boolean see = false;
    
    public boolean add_e = true;
    public boolean eliminate_e = false;
    public boolean add_s = true;
    public boolean eliminate_s = false;
    
    public final Options view;

    public Button_design(Options view) {
        this.view = view;
 
        events();
    }
    

    public final void events() {
        view.button_employee.addMouseListener(this);
        view.button_sale.addMouseListener(this);
        
        view.button_add_employee.addMouseListener(this);
        view.button_eliminate_employee.addMouseListener(this);
        view.button_add_sale.addMouseListener(this);
        view.button_eliminate_sale.addMouseListener(this);
        
        view.button_graphique.addMouseListener(this);
        view.button_see.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        //cambio de color de los botones del menu
        Object evt = e.getSource();
        if (evt.equals(view.button_employee)) {
            changeAparence(view.panel_employee, new Color(11, 61, 138));

            changeAparence(view.panel_sale, new Color(23, 93, 163));
            changeAparence(view.panel_graphique, new Color(23, 93, 163));
            changeAparence(view.panel_see, new Color(23, 93, 163));
            employee = true;
            sale = false;
            graphique = false;
            see = false;
        }
        if (evt.equals(view.button_sale)) {
            changeAparence(view.panel_sale, new Color(11, 61, 138));

            changeAparence(view.panel_employee, new Color(23, 93, 163));
            changeAparence(view.panel_graphique, new Color(23, 93, 163));
            changeAparence(view.panel_see, new Color(23, 93, 163));
            employee = false;
            sale = true;
            graphique = false;
            see = false;
        }
        if (evt.equals(view.button_graphique)) {
            changeAparence(view.panel_graphique, new Color(11, 61, 138));

            changeAparence(view.panel_sale, new Color(23, 93, 163));
            changeAparence(view.panel_employee, new Color(23, 93, 163));
            changeAparence(view.panel_see, new Color(23, 93, 163));
            employee = false;
            sale = false;
            graphique = true;
            see = false;
        }
        if (evt.equals(view.button_see)) {
            changeAparence(view.panel_see, new Color(11, 61, 138));

            changeAparence(view.panel_sale, new Color(23, 93, 163));
            changeAparence(view.panel_graphique, new Color(23, 93, 163));
            changeAparence(view.panel_employee, new Color(23, 93, 163));
            employee = false;
            sale = false;
            graphique = false;
            see = true;
        }
        
        //botones de eliminar y agregar empleado y ventas(cambio de colores)
        if (evt.equals(view.button_add_employee)) {
            changeAparence(view.panel_add_employee, new Color(11, 61, 138));

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));
    
            add_e = true;
            eliminate_e = false;
        }
        if (evt.equals(view.button_eliminate_employee)) {
            changeAparence(view.panel_add_employee, new Color(23, 93, 163));

            changeAparence(view.panel_eliminate_employee, new Color(11, 61, 133));
    
            add_e = false;
            eliminate_e = true;
        }
        if (evt.equals(view.button_add_sale)) {
            changeAparence(view.panel_add_sale, new Color(11, 61, 133));

            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
    
            add_s = true;
            eliminate_s = false;
        }
        if (evt.equals(view.button_eliminate_sale)) {
            changeAparence(view.panel_add_sale, new Color(23, 93, 163));

            changeAparence(view.panel_eliminate_sale, new Color(11, 61, 133));
    
            add_s = false;
            eliminate_s = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.button_employee) && !employee) {
            changeAparence(view.panel_employee, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_sale) && !sale) {

            changeAparence(view.panel_sale, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_graphique) && !graphique) {

            changeAparence(view.panel_graphique, new Color(27, 105, 188));

        }
        if (evt.equals(view.button_see) && !see) {

            changeAparence(view.panel_see, new Color(27, 105, 188));
        }
        if (evt.equals(view.button_add_employee) && !add_e) {

            changeAparence(view.panel_add_employee, new Color(27, 105, 188));
        }
        if (evt.equals(view.button_eliminate_employee) && !eliminate_e) {

            changeAparence(view.panel_eliminate_employee, new Color(27, 105, 188));
        }
        if (evt.equals(view.button_eliminate_sale) && !eliminate_s) {

            changeAparence(view.panel_eliminate_sale, new Color(27, 105, 188));
        }
        if (evt.equals(view.button_add_sale) && !add_s) {

            changeAparence(view.panel_add_sale, new Color(27, 105, 188));
        }

    }

    @Override
    //Acccion al quitar el mouse
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        if (evt.equals(view.button_employee) && !employee) {
            changeAparence(view.panel_employee, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_sale) && !sale) {

            changeAparence(view.panel_sale, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_graphique) && !graphique) {

            changeAparence(view.panel_graphique, new Color(23, 93, 163));

        }
        if (evt.equals(view.button_see) && !see) {

            changeAparence(view.panel_see, new Color(23, 93, 163));
        }
        if (evt.equals(view.button_add_employee) && !add_e) {

            changeAparence(view.panel_add_employee, new Color(23, 93, 163));
        }
        if (evt.equals(view.button_eliminate_employee) && !eliminate_e) {

            changeAparence(view.panel_eliminate_employee, new Color(23, 93, 163));
        }
        if (evt.equals(view.button_eliminate_sale) && !eliminate_s) {

            changeAparence(view.panel_eliminate_sale, new Color(23, 93, 163));
        }
        if (evt.equals(view.button_add_sale) && !add_s) {

            changeAparence(view.panel_add_sale, new Color(23, 93, 163));
        }
    }

    public void changeAparence(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
