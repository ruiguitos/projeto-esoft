package GestaoEventos;

import javax.swing.*;

public class criarEvento extends JFrame {


    private JPanel painelPrincipal;

    public criarEvento(String title){

        super(title);
        setContentPane(painelPrincipal);
        pack();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
}
