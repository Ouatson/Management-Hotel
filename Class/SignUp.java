package Class;

import java.io.FileWriter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUp extends JFrame{
    JTextField t1,t2;
    JButton b1;
    public SignUp(){
        setLayout(null);

        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("Valider");

        t1.setBounds(100,20,80,30);
        t2.setBounds(100,60,80,30);
        b1.setBounds(100,100,80,30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                try{
                    FileWriter fw = new FileWriter("login.txt", true);
                    fw.write(t1.getText()+"\t"+t2.getText()+"\n");
                    fw.close();
                    Frame f = new JFrame();
                    JOptionPane.showMessageDialog(f,"Identifier Complet");
                    dispose();
                }catch(Exception e){}
                
            
            }
        });

        add(t1);
        add(t2);
        add(b1);
    }
}
