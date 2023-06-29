package GestaoModalidades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gestaoModalidadeMain extends JFrame {
    private JButton consultarRegulamentosButton;
    private JButton criarModalidadeButton;
    private JButton editarModalidadesButton;
    private JButton desativarModalidadeButton;
    private JButton consultarModalidadesButton;
    private JButton historicoEPremiosEButton;
    private JButton voltarButton;
    private JPanel painelPrincipal;

    public gestaoModalidadeMain(String title) {

    super(title);
    setContentPane(painelPrincipal);
    pack();
    setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

    voltarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
    historicoEPremiosEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    desativarModalidadeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    consultarRegulamentosButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    criarModalidadeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    editarModalidadesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    consultarModalidadesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
