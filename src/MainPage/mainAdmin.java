package MainPage;

import GestaoAtletas.gestaoAtletaMain;
import GestaoEventos.gestaoEventoMain;
import GestaoModalidades.gestaoModalidadeMain;
import GestaoProvas.gestaoProvaMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainAdmin extends JFrame {

    private JButton editarDadosButton;
    private JButton calendárioDeEventosButton;
    private JButton alterarDadosPessoaisButton;
    private JButton gestãoDeProvasButton;
    private JButton gestãoDeEventosButton;
    private JButton gestãoDeAtletasButton;
    private JButton calendárioDeProvasEliminatóriasButton;
    private JButton gestãoStaffButton;
    private JButton gestãoDeModalidadesButton;
    private JButton sairButton;
    private JButton logoutButton;
    private JPanel painelPrincipal;

    public mainAdmin(String title){
        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        gestãoDeProvasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoProvaMain adminForm = new gestaoProvaMain("Gestão de Provas");
                adminForm.setVisible(true);
            }
        });
        gestãoDeEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoEventoMain adminForm = new gestaoEventoMain("Gestão de Eventos");
                adminForm.setVisible(true);
            }
        });
        gestãoStaffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alterarDadosPessoaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gestãoDeAtletasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoAtletaMain adminForm = new gestaoAtletaMain("Gestão de Atletas");
                adminForm.setVisible(true);
            }
        });
        gestãoDeModalidadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoModalidadeMain adminForm = new gestaoModalidadeMain("Gestão de Modalidades");
                adminForm.setVisible(true);
            }
        });
        calendárioDeEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        calendárioDeProvasEliminatóriasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
