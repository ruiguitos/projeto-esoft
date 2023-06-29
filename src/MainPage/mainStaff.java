package MainPage;

import GestaoAtletas.gestaoAtletaMain;
import GestaoEventos.gestaoEventoMain;
import GestaoModalidades.gestaoModalidadeMain;
import GestaoProvas.gestaoProvaMain;

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

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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
        gestãoDeModalidadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoModalidadeMain adminForm = new gestaoModalidadeMain("Gestão de Modalidades");
                adminForm.setVisible(true);
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
                gestaoEventoMain adminForm = new gestaoEventoMain("Gestão de Eventos");
                adminForm.setVisible(true);
            }
        });
        gestaoDeProvasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoProvaMain adminForm = new gestaoProvaMain("Gestão de Provas");
                adminForm.setVisible(true);
            }
        });
        gestãoDeAtletasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestaoAtletaMain adminForm = new gestaoAtletaMain("Gestão de Atletas");
                adminForm.setVisible(true);
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
