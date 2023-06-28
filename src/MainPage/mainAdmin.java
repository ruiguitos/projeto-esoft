package MainPage;

import javax.swing.*;

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
    private JButton button2;
    private JButton logoutButton;
    private JPanel painelPrincipal;

    public mainAdmin(String title){
        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
