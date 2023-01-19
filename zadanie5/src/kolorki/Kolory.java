package kolorki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kolory extends JFrame implements ActionListener {
    int r=3;
    JButton przycisk[][];
    Kolory(){
        super("Kolorki");
        setBounds(0,0,600,600);
         JPanel panel = new JPanel(new GridLayout(3,3,0,0));

         przycisk = new JButton[r][r];
        for (int i = 0; i < przycisk.length; i++) {
            for (int j = 0; j < przycisk.length; j++) {
                przycisk[i][j] = new JButton();
                przycisk[i][j].setBackground(Color.white);
                panel.add(przycisk[i][j]);
                przycisk[i][j].addActionListener(this);
            }
        }

        setContentPane(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Kolory();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractButton button = (AbstractButton)e.getSource();
        Color color = button.getBackground();

        if(color == Color.white){
            button.setBackground(Color.red);
        } else if (color == Color.red) {
            button.setBackground(Color.black);
        } else if (color == Color.black) {
            button.setBackground(Color.red);
        }
    }
}
