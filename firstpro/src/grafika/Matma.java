package grafika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matma extends JFrame implements ActionListener {
    JPanel panel;
    JLabel et1;
    JLabel et2;
    JLabel et3;
    JTextField pole1;
    JTextField pole2;
    JTextField pole3;
    JButton przycisk;
    JComboBox operator;
    double wynik;
    Matma(){
        super("Matma");
        setSize(700,600);
        panel = new JPanel(null);

        et1 = new JLabel("pierwszy argument:");
        et2 = new JLabel("drugi argument:");
        et3 = new JLabel("Wynik obliczen:");
        pole1 = new JTextField();
        pole2 = new JTextField();
        pole3 = new JTextField();
        przycisk = new JButton("oblicz");
        String znak[]={"+","-","*","/"};
        operator = new JComboBox(znak);

        et1.setBounds(100,25,200,25);
        et2.setBounds(100,50,200,75);
        et3.setBounds(150,125,150,76);
        pole1.setBounds(250,25,50,25);
        pole2.setBounds(250,75,50,25);
        pole3.setBounds(250,150,50,25);
        przycisk.setBounds(200,110,110,25);
        operator.setBounds(310,25,100,25);

        panel.add(et1);
        panel.add(et2);
        panel.add(et3);
        panel.add(pole1);
        panel.add(pole2);
        panel.add(pole3);
        panel.add(przycisk);
        panel.add(operator);



        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Matma();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obiekt = e.getSource();

        if(obiekt==przycisk){
            String s1 = pole1.getText();
            String s2 = pole2.getText();
            double liczba1=0;
            double liczba2=0;
            try{
                liczba1 = Double.parseDouble(s1);
                liczba2 = Double.parseDouble(s2);
            }   catch (Exception extepion){
                JOptionPane.showMessageDialog(this,"Nieprawidłowa wartość");
            }

            switch(operator.getSelectedIndex()){
                case 0: wynik=liczba1 + liczba2;break;
                case 1: wynik=liczba1 - liczba2;break;
                case 2: wynik=liczba1 * liczba2;break;
                case 3: if(liczba2!=0){
                    wynik = liczba1 / liczba2;
                }else JOptionPane.showMessageDialog(this,"bruh nie dzieli się przez 0 XD");
                    break;
            }
            pole3.setText(String.valueOf(wynik));
        }
    }
}
