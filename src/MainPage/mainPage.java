package MainPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage extends JFrame{

    private JPanel painelPrincipal;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton loginButton;
    private JButton sairButton;

    public  mainPage(String title){
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
    }

    public static void main (String[] args){
        new mainPage("Página Principal").setVisible(true);
    }

}
