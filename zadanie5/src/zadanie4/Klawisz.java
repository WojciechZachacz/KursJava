package zadanie4;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Klawisz extends JFrame implements AdjustmentListener {

    int x=0,y=475;
    JPanel panel, panel2;
    JButton przycisk;
    JScrollBar sliderX, sliderY;
    Klawisz(){
        super("Klawisz");
        setBounds(0,0,715,700);
        panel = new JPanel(null);

        {
            panel2 = new JPanel(null);
//            TitledBorder tytul2 = BorderFactory.createTitledBorder("Panel2");
            panel2.setBounds(200,0,500,500);
//            panel2.setBorder(tytul2);
            panel2.setBackground(Color.LIGHT_GRAY);
            panel.add(panel2);

            przycisk = new JButton(x+", "+y);
            przycisk.setBounds(0,475,100,25);
            panel2.add(przycisk);
//            przycisk.addActionListener(this);

            sliderY = new JScrollBar(1,475,0,0,475);
            sliderY.setBounds(180,0,20,500);
            panel.add(sliderY);
            sliderY.addAdjustmentListener(this);

            sliderX = new JScrollBar(0,0,0,0,400);
            sliderX.setBounds(200,500,500,20);
            panel.add(sliderX);
            sliderX.addAdjustmentListener(this);

        }

        setContentPane(panel);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Klawisz();
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

        y = sliderY.getValue();
        x = sliderX.getValue();
        przycisk.setText(x+", "+y);
        przycisk.setBounds(x, y,100,25);
    }
}
