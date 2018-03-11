package macias.nelson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla1 extends JFrame {

    private JLabel lbl_entrada;

    private JTextField txt_campo;
    private JButton btn_aceptar;
    private JButton btn_salir;

    Retorno re = new Retorno();


    public Pantalla1() {
        super("Pantalla 1");
        this.getContentPane().setBackground(Color.cyan);

        lbl_entrada = new JLabel("Entrada:");
        lbl_entrada.setBounds(20, 30, 60, 20);

        txt_campo = new JTextField(20);
        txt_campo.setBounds(150, 30, 200, 30);

        btn_aceptar = new JButton("Aceptar");
        btn_aceptar.setBounds(150, 80, 80, 30);

        btn_salir = new JButton("Salir");
        btn_salir.setBounds(270, 80, 80, 30);

        FlowLayout f = new FlowLayout();
        setLayout(null);

        add(lbl_entrada);
        add(txt_campo);
        add(btn_aceptar);
        add(btn_salir);
        retornarTexto();
        salir();


    }

    public void retornarTexto() {

        btn_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String texto = txt_campo.getText();
                texto = texto.replaceAll(" ", "");
                if (texto.length() == 0) {

                    JOptionPane.showMessageDialog(null, "El campo se encuentra vacio,\n Introduzca Texto por Favor");

                } else {

                    JLabel mensaje;
                    mensaje = new JLabel("");
                    mensaje.setText(txt_campo.getText());
                    mensaje.setForeground(Color.white);
                    mensaje.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                    mensaje.setBounds(50, 20, 450, 50);

                    Retorno re = new Retorno();
                    re.add(mensaje);
                    re.setVisible(true);

                }


            }
        });
    }

    public void salir() {
        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                        "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    System.exit(0);

            }
        });
    }


}
