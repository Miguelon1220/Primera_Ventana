package p1;
import javax.swing.*;
import java.awt.event.*;

public class MiSegundoFormulario extends JFrame implements ActionListener{

    private JButton botonSalir,botonRegresar;
    private JLabel LabelMiguelLoyola;
    private MiPrimerFormulario ventanaPrincipal;
    public MiSegundoFormulario(MiPrimerFormulario ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
        setLayout(null);
        setTitle("MiSegundo Formulario");

        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(50,50,150,50);
        add(botonRegresar);
        botonRegresar.addActionListener(this);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(250,50,150,50);
        add(botonSalir);
        botonSalir.addActionListener(this);

        LabelMiguelLoyola = new JLabel("Miguel Loyola");
        LabelMiguelLoyola.setBounds(185,150,150,50);
        add(LabelMiguelLoyola);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonRegresar){
            this.dispose();
            ventanaPrincipal.setVisible(true);
        }
        if(e.getSource()==botonSalir){
            System.exit(0);
        }
    }


}
