package GestaoAtletas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gestaoAtletaMain extends JFrame {
    private JButton criarAtletaButton;
    private JButton consultarResultadosButton;
    private JButton gerirInscriçõesButton;
    private JButton consultarAtletaButton;
    private JButton aprovarInscriçõesButton;
    private JButton importaçõesButton;
    private JButton editarAtletaButton;
    private JButton eliminarAtletaButton;
    private JButton voltarButton;
    private JPanel painelPrincipal;


    public gestaoAtletaMain(String title){

        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        criarAtletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        editarAtletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        importaçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aprovarInscriçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        consultarResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eliminarAtletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gerirInscriçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        consultarAtletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
