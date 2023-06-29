package MainPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainAtleta extends JFrame {

    private JPanel painelPrincipal;
    private JButton alterarDadosPessoaisButton;
    private JButton inscriçõesButton;
    private JButton calendárioDeProvasEliminatóriasButton;
    private JButton calendárioDeEventosButton;
    private JButton históricoButton;
    private JButton logoutButton;
    private JButton sairButton;

    public mainAtleta(String title){

        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        inscriçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        calendárioDeProvasEliminatóriasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        calendárioDeEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        históricoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alterarDadosPessoaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
