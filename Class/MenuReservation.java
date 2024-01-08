package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuReservation extends JFrame {
    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6;

    MenuReservation() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Liste des reservations!");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 10, 800, 70);

        add(l1);

        b1 = new JButton("Id_Reservation");
        b2 = new JButton("Nombre_nuits");
        b3 = new JButton("Date_Entree");
        b4 = new JButton("Date_Sortie");
        b5 = new JButton("Prix");
        b6 = new JButton("Type_Chambre");

        b1.setBounds(100, 60, 120, 30);
        b2.setBounds(100, 60, 120, 30);

        b3.setBounds(100, 60, 120, 30);
        b4.setBounds(100, 60, 120, 30);

        b5.setBounds(100, 60, 120, 30);
        b6.setBounds(100, 60, 120, 30);

        l2 = new JLabel("");
        l2.setBounds(250, 80, 200, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

    public static void main(String[] args) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JLabel) {
                    String text = ((JLabel) e.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        };

        JPanel panel = new JPanel(new GridLayout(1, 6));

        JButton[] array = new JButton[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = new JButton(String.valueOf(i));
            // array[i].addActionListener(listener);
            panel.add(array[i]);
        }

        JOptionPane.showMessageDialog(null, panel);
        panel.setBounds(400, 200, 400, 700);
    }
}
