package MainPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage extends JFrame {

    private JPanel painelPrincipal;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton loginButton;
    private JButton sairButton;
    private JButton atletaButton;
    private JButton staffButton;
    private JButton adminButton;

    public mainPage(String title) {
        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainAdmin adminForm = new mainAdmin("Menu Principal Admin");
                adminForm.setVisible(true);
            }
        });

        atletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainAtleta atletaForm = new mainAtleta("Menu Principal Atleta");
                atletaForm.setVisible(true);
            }
        });

        staffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainStaff staffForm = new mainStaff("Menu Principal Staff");
                staffForm.setVisible(true);
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new mainPage("Página Principal").setVisible(true);
    }
}