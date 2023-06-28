package MainPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainStaff extends JFrame {

    private JPanel painelPrincipal;
    private JButton editarDadosButton;
    private JButton alterarDadosPessoaisButton;
    private JButton calendárioDeProvasEliminatóriasButton;
    private JButton gestãoDeAtletasButton;
    private JButton gestaoDeProvasButton;
    private JButton gestãoDeEventosButton;
    private JButton gestãoDeModalidadesButton;
    private JButton logoutButton;
    private JButton sairButton;


    public mainStaff(String title){
        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainAdmin adminForm = new mainAdmin("Admin Form");
                adminForm.dispose(); // Close the current adminForm
                mainPage mainPage = new mainPage("Página Principal");
                mainPage.setVisible(true);
            }
        });
        gestãoDeModalidadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alterarDadosPessoaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gestãoDeEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gestaoDeProvasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gestãoDeAtletasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        editarDadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        calendárioDeProvasEliminatóriasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
