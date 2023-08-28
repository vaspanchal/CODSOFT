import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;

public class confirmation implements ActionListener {

    JFrame frame2 = new JFrame();
    // initial interface
    JLabel instruction = new JLabel();
    JPasswordField passwordField2 = new JPasswordField();
    JButton enter = new JButton("ENTER");

    confirmation()
    {
        instruction.setText("RE-ENTER YOUR PIN TO CONFIRM");
        instruction.setBounds(150,50,700,75);
        instruction.setBorder(BorderFactory.createEmptyBorder());
        instruction.setFont(new Font("verdana",Font.PLAIN, 30)); //its font
        instruction.setForeground(Color.WHITE);
        instruction.setHorizontalAlignment(JTextField.CENTER);

        //input textfield
        passwordField2.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        passwordField2.setBounds(270,150,450,75); //x-cord, y-cord, width, height of field
        passwordField2.setFont(new Font("ink free",Font.BOLD, 30));
        passwordField2.setForeground(new Color(0x382e5e));

        enter.setBounds(350,275,300,75);
        enter.setBorder(BorderFactory.createEmptyBorder());
        enter.setFont(new Font("Ink Free",Font.BOLD,35)); //its font and size
        enter.setBackground(new Color(0xc64145));
        enter.setForeground(Color.WHITE);
        enter.addActionListener(this);
        enter.setFocusable(false);

        frame2.add(instruction);
        frame2.add(passwordField2);
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
                instruction.setText("Please Enter Correct Pin ");
                passwordField2.setText("");

            }
            else{
                finalWindow fw = new finalWindow();
                frame2.dispose();
            }



        }
    }
}
