package Class;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3, b4;

    public MenuPrincipal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Bienvenue sur votre Application de Gestion Hoteliere !");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 10, 800, 70);

        add(l1);

        // ajouter, modifier, supprimer,

        t1 = new JTextField(200);
        t2 = new JTextField(200);
        b1 = new JButton("Gestion des Clients"); // gestion des commandes
        b2 = new JButton("Gestion des Reservations"); // gestion des chambres
        b3 = new JButton("Gestion des Utilisateurs");
        b4 = new JButton("Historique"); // gesttion des factures

        t1.setBounds(100, 60, 120, 30);
        t2.setBounds(100, 100, 120, 30);

        b1.setBounds(140, 100, 300, 40);
        b2.setBounds(140, 160, 300, 40);

        b3.setBounds(140, 220, 300, 40);
        b4.setBounds(140, 280, 300, 40);

        l2 = new JLabel("");
        l2.setBounds(250, 80, 200, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        // add(t1);
        // add(t2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() instanceof JButton) {
                    String text = ((JButton) ae.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }

                System.out.println("Dans reservation");

                dispose();
                MenuReservation menuReservation = new MenuReservation();
                menuReservation.setBounds(400, 200, 400, 300);
                menuReservation.setVisible(true);
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() instanceof JButton) {
                    String text = ((JButton) ae.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() instanceof JButton) {
                    String text = ((JButton) ae.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() instanceof JButton) {
                    String text = ((JButton) ae.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        });
    }
}
