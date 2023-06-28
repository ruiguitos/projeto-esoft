package MainPage;

import javax.swing.*;

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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
