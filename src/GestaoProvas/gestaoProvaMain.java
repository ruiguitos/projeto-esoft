package GestaoProvas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gestaoProvaMain extends JFrame{
    private JPanel painelPrincipal;
    private JButton eliminarProvaButton;
    private JButton criarProvaButton;
    private JButton voltarButton;
    private JButton consultarProvaButton;
    private JButton editarProvaButton;

    public gestaoProvaMain(String title) {
        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        voltarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
    eliminarProvaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
        criarProvaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        editarProvaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        consultarProvaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
