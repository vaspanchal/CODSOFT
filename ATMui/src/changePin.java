import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class changePin extends PIN implements ActionListener {
    JFrame frame2 = new JFrame();
    // initial interface
    JLabel current = new JLabel();
    JLabel newpin = new JLabel();
    JPasswordField passwordField2 = new JPasswordField();
    JPasswordField passwordField3 = new JPasswordField();
    JButton enter = new JButton("ENTER");

    changePin()
    {
        current.setText("ENTER CURRENT PIN");
        current.setBounds(150,50,700,75);
        current.setBorder(BorderFactory.createEmptyBorder());
        current.setFont(new Font("verdana",Font.PLAIN, 30)); //its font
        current.setForeground(Color.WHITE);
        current.setHorizontalAlignment(JTextField.CENTER);

        //input textfield
        passwordField2.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        passwordField2.setBounds(270,125,450,75); //x-cord, y-cord, width, height of field
        passwordField2.setFont(new Font("ink free",Font.BOLD, 30));
        passwordField2.setForeground(new Color(0x382e5e));

        newpin.setText("ENTER NEW PIN");
        newpin.setBounds(150,225,700,75);
        newpin.setBorder(BorderFactory.createEmptyBorder());
        newpin.setFont(new Font("verdana",Font.PLAIN, 30)); //its font
        newpin.setForeground(Color.WHITE);
        newpin.setHorizontalAlignment(JTextField.CENTER);

        passwordField3.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        passwordField3.setBounds(270,300,450,75); //x-cord, y-cord, width, height of field
        passwordField3.setFont(new Font("ink free",Font.BOLD, 30));
        passwordField3.setForeground(new Color(0x382e5e));

        enter.setBounds(350,450,300,75);
        enter.setBorder(BorderFactory.createEmptyBorder());
        enter.setFont(new Font("Ink Free",Font.BOLD,35)); //its font and size
        enter.setBackground(new Color(0xc64145));
        enter.setForeground(Color.WHITE);
        enter.addActionListener(this);
        enter.setFocusable(false);

        frame2.add(current);
        frame2.add(passwordField2);
        frame2.add(newpin);
        frame2.add(passwordField3);
        frame2.add(enter);


        frame2.setTitle("CodSoft Bank Of India"); //window title
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame2.setSize(1020,600); //window size
        frame2.getContentPane().setBackground(new Color(0x382e5e));
        frame2.setLayout(null); //no label layout used
        frame2.setResizable(false); //window is not resizeable
        frame2.setVisible(true); //last line




    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==enter)
        {
            accessWindow aw = new accessWindow();
            aw.frame.dispose();

            if(!Arrays.equals(passwordField2.getPassword(),aw.passwordField.getPassword()))
            {
                current.setText("PLEASE ENTER CORRECT PIN!");

            }
            else{

                String t = String.valueOf(passwordField3.getPassword());
                int p = Integer.parseInt(t);
                    pin = p;

                    accessWindow accessWindow = new accessWindow();
                    accessWindow.passwordField.setText(null);
                    frame2.dispose();

            }



        }
    }
}
