package z4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Klawisz extends JFrame implements AdjustmentListener {
    int x=0, y=475;
    JPanel panelG, panel;
    JButton przycisk;
    JScrollBar barX, barY;
    Klawisz(){
        super("Klawisz");
        setBounds(0,0,700,700);

        panelG = new JPanel(null);

        panel = new JPanel(null);
        panel.setBounds(25,0,500,500);
        panel.setBackground(Color.lightGray);
        panelG.add(panel);

        przycisk = new JButton(x+", "+y);
        przycisk.setBounds(0,475,100,25);
        panel.add(przycisk);

        barY = new JScrollBar(Adjustable.VERTICAL,475,0,0,475);
        barY.setBounds(0,0,25,500);
        barY.addAdjustmentListener(this);
        panelG.add(barY);

        barX = new JScrollBar(Adjustable.HORIZONTAL,0,0,0,400);
        barX.setBounds(25,500,500,25);
        barX.addAdjustmentListener(this);
        panelG.add(barX);

        setContentPane(panelG);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Klawisz();
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        y=barY.getValue();
        x=barX.getValue();
        przycisk.setText(x+", "+y);
        przycisk.setBounds(x,y,100,25);
    }
}
