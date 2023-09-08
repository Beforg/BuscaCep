package BuscadorDeCep.frame;

import BuscadorDeCep.modelos.Historico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelHistorico extends JFrame implements ActionListener {
    JComboBox<String> addHistorico = new JComboBox<>();
    public PainelHistorico(){
        this.setTitle("Histórico");
        this.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(addHistorico);
        this.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
