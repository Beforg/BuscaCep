package BuscadorDeCep.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraMenu extends JMenuItem implements ActionListener{
    JMenu arquivo = new JMenu("Arquivo");
    JMenuItem sobre = new JMenuItem("Sobre");
    JMenuItem sair = new JMenuItem("Sair");


    BarraMenu() {

        arquivo.add(sobre);
        arquivo.add(sair);

        sobre.addActionListener(this);
        sair.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sobre) {
            JOptionPane.showMessageDialog(null,"Criado por Bruno\n ADS IFSUL 2023-2 \n v1.0", "Créditos",
                    JOptionPane.INFORMATION_MESSAGE);
        } if (e.getSource()==sair) {
            UIManager.put("OptionPane.noButtonText", "Não");
            UIManager.put("OptionPane.yesButtonText", "Sim");
            int opcao = JOptionPane.showConfirmDialog(null,"Deseja encerrar e sair?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (opcao == 0) {
                System.exit(0);
            }

        }
    }
}
