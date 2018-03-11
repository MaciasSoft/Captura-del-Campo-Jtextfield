package macias.nelson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retorno extends JDialog{

    private JButton btn_salirVentana;

    public Retorno()
    {
        super();
        this.getContentPane().setBackground(Color.BLACK);
        this.setBounds(600,200,400,300);
        this.setModal(true);

        btn_salirVentana=new JButton("Volver");

        btn_salirVentana.setBounds(300,220,80,20);

        FlowLayout f = new FlowLayout();
        setLayout(null);

        add(btn_salirVentana);

        salirWindow();


            }
    public void salirWindow() {
        btn_salirVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();



            }
        });
}
}
