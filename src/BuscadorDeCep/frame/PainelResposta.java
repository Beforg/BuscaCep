package BuscadorDeCep.frame;

import BuscadorDeCep.modelos.InfoCep;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PainelResposta extends JPanel {

    JLabel mostraCep = new JLabel();
    JLabel aviso = new JLabel();

    PainelResposta() {
        this.setLayout(null);
        this.setBounds(-10, 86, 420, 180);
        this.setBackground(Color.GRAY);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createEtchedBorder());

        aviso.setLayout(null);
        aviso.setBounds(65, 60, 310, 40);
        aviso.setFont(new Font("Cosmic Sons", Font.ITALIC, 15));
        aviso.setText("As informações serão mostradas aqui.");
        this.add(aviso);

        mostraCep.setLayout(null);
        mostraCep.setBounds(50, 0, 300, 180);
        mostraCep.setVisible(false);
        mostraCep.setFont(new Font("Consolas", Font.BOLD, 20));
        mostraCep.setBackground(Color.LIGHT_GRAY);
        mostraCep.setBorder(BorderFactory.createEtchedBorder());
        mostraCep.setOpaque(true);
        mostraCep.setForeground(Color.BLACK);
        this.add(mostraCep);

    }

    public void imprimeResposta(boolean visivel, InfoCep cep) {
        mostraCep.setVisible(visivel);
        mostraCep.setText("<html>" + "Cep: " + cep.cep() + "<br>" + "Rua: " + cep.logradouro() + "<br>" + "Bairro:" + cep.bairro() +
                "<br>" + "Cidade: " + cep.localidade() + "<br>" + "Estado: " + cep.uf() + "</html>");
        aviso.setVisible(false);
    }
}
