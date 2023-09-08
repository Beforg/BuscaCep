package BuscadorDeCep.frame;
import BuscadorDeCep.modelos.BuscarCep;
import BuscadorDeCep.modelos.InfoCep;
import com.google.gson.JsonSyntaxException;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MainScreen extends JFrame implements ActionListener, MouseListener {
 //   JMenuBar barraMenu = new JMenuBar();
    JTextField displayBusca = new JTextField("ex: 01001-000");
    JLabel textoBusca = new JLabel("Informe o CEP:");

    ImageIcon iconeBuscador = new ImageIcon("out/production/ProjetosPortfolio/BuscadorDeCep/icons/codigo-postal.png");
    JButton pesquisar = new JButton("Pesquisar");
    PainelResposta painelResposta = new PainelResposta();
    JMenuBar menuBar = new JMenuBar();
    BarraMenu itenMenu = new BarraMenu();


        public MainScreen() {
            //Config screen

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(400,350);
            this.setTitle("Buscador de CEP");
            this.setIconImage(iconeBuscador.getImage());
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

            menuBar.add(itenMenu.arquivo);
            this.setJMenuBar(menuBar);
            //Config display ================================
            displayBusca.setBounds(180,6,105,20);
            displayBusca.setFont(new Font("Consolas", Font.ITALIC,10));
            displayBusca.setMargin(new Insets(3,10,3,10));
            displayBusca.addActionListener(this);
            displayBusca.addMouseListener(this);
            this.add(displayBusca);

            textoBusca.setBounds(6,6,190,20);
            textoBusca.setFont(new Font("Elephant", Font.BOLD, 20));
            this.add(textoBusca);
            this.add(painelResposta);

            pesquisar.setBounds(290,6,80,20);
            pesquisar.setMargin(new Insets(3,8,3,8));
            pesquisar.setFocusable(false);
            pesquisar.addActionListener(this);
            this.add(pesquisar);



        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == displayBusca || e.getSource()==pesquisar) {
            try {

                BuscarCep buscarCep = new BuscarCep();
                InfoCep novoCep = buscarCep.BuscarCep(displayBusca.getText().replace("-",""));
                System.out.println(novoCep);
                painelResposta.imprimeResposta(true, novoCep);
                JOptionPane.showMessageDialog(null,novoCep,"Resultado",JOptionPane.INFORMATION_MESSAGE);

            } catch (IllegalArgumentException f) {
                JOptionPane.showMessageDialog(null,"Nenhum CEP inserido!","Alerta",JOptionPane.ERROR_MESSAGE);
            } catch (JsonSyntaxException f) {
                String mensagem = "CEP INVÁLIDO\n Exemplo de CEP válido: 01001000";
                JOptionPane.showMessageDialog(null,mensagem,"Alerta",JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==displayBusca || displayBusca.getVerifyInputWhenFocusTarget()) {
            displayBusca.setText("");
            displayBusca.setFont(new Font("Arial", Font.PLAIN, 14));
        }
        }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
