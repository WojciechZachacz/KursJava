package sroda;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobby extends JFrame implements ActionListener{
    JPanel panel, panelPlec, panelHobby;
    JLabel imie, nazwisko, wiek;
    JTextField Pimie, Pnazwisko, Pwiek;
    JRadioButton opcja1, opcja2;
    JCheckBox wybor1, wybor2, wybor3, wybor4;
    JButton buton;



    Hobby(){
        super("Hobby");
        setBounds(100,100,500,300);

        {
            panel = new JPanel(null);

            imie = new JLabel("podaj imie:");
            imie.setBounds(5,25,125,25);
            nazwisko = new JLabel("podaj nazwisko:");
            nazwisko.setBounds(5,60,125,25);
            wiek = new JLabel("podaj wiek:");
            wiek.setBounds(5,95,125,25);
            Pimie = new JTextField();
            Pimie.setBounds(100, 25,125,25);
            Pnazwisko = new JTextField();
            Pnazwisko.setBounds(100, 60,125,25);
            Pwiek = new JTextField();
            Pwiek.setBounds(100, 95,125,25);

            panel.add(imie);
            panel.add(nazwisko);
            panel.add(wiek);
            panel.add(Pimie);
            panel.add(Pnazwisko);
            panel.add(Pwiek);

            {
                buton = new JButton("Wyswietl");
                buton.setBounds(310,215,100,25);
                panel.add(buton);
                buton.addActionListener(this);
            }

        }

        {
            ButtonGroup plec = new ButtonGroup();
            TitledBorder tytulplec = BorderFactory.createTitledBorder("Płeć:");
            panelPlec = new JPanel(null);
            panelPlec.setBounds(5, 120, 225,130);
            panelPlec.setBorder(tytulplec);
            panel.add(panelPlec);

            opcja1 = new JRadioButton("Mezczyzna");
            opcja2 = new JRadioButton("Kobieta");
            opcja1.setBounds(25,30,100,25);
            opcja2.setBounds(25,55,100,25);
            panelPlec.add(opcja1);
            panelPlec.add(opcja2);
            plec.add(opcja1);
            plec.add(opcja2);


        }

        {
            ButtonGroup hobby = new ButtonGroup();
            TitledBorder tytulhobby = BorderFactory.createTitledBorder("Zainteresowania:");
            panelHobby = new JPanel(null);
            panelHobby.setBounds(245,5,225,200);
            panelHobby.setBorder(tytulhobby);
            panel.add(panelHobby);

            wybor1 = new JCheckBox("Programowanie");
            wybor2 = new JCheckBox("Samochody");
            wybor3 = new JCheckBox("Narciarstwo");
            wybor4 = new JCheckBox("Sport");
            wybor1.setBounds(25,30,100,25);
            wybor2.setBounds(25,60,100,25);
            wybor3.setBounds(25,90,100,25);
            wybor4.setBounds(25,120,100,25);
            panelHobby.add(wybor1);
            panelHobby.add(wybor2);
            panelHobby.add(wybor3);
            panelHobby.add(wybor4);

        }

        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hobby();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object o = actionEvent.getSource();

        if (o == buton){
            String Imie = Pimie.getText();
            String Nazwisko = Pnazwisko.getText();
            String Wiek = Pwiek.getText();

            String P = "";
            String F = "";

            if (opcja1.isSelected()){
                P = "Mężczyzna";
            }
            else if(opcja2.isSelected()) {
                P = "Kobieta";
            }

            if (wybor1.isSelected()){
                F += "Programowanie, ";
            }
            else if (wybor2.isSelected()){
                F += "Samochody, ";
            }
            else if (wybor3.isSelected()){
                F += "Narciarstwo, ";
            }
            else if (wybor4.isSelected()){
                F += "Sport";
            }
            JOptionPane.showMessageDialog(this,"Imie: "+Imie+"\nNazwisko: "+Nazwisko+"\nWiek: "+Wiek+"\nPłeć: "+P+"\nZainteresowania: "+F);
        }
    }
}
