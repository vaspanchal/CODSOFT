import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class accessWindow extends PIN implements ActionListener {

    JFrame frame = new JFrame();
    // initial interface
    JLabel instruction = new JLabel();
    public static JPasswordField passwordField = new JPasswordField();
    JButton enter = new JButton("ENTER");


    accessWindow() {
        instruction.setText("ENTER YOUR PIN BELOW");
        instruction.setBounds(150, 50, 700, 75);
        instruction.setBorder(BorderFactory.createEmptyBorder());
        instruction.setFont(new Font("verdana", Font.PLAIN, 30)); //its font
        instruction.setForeground(Color.WHITE);
        instruction.setHorizontalAlignment(JTextField.CENTER);

        //input textfield
        passwordField.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        passwordField.setBounds(270, 150, 450, 75); //x-cord, y-cord, width, height of field
        passwordField.setFont(new Font("ink free",Font.BOLD, 30));
        passwordField.setForeground(new Color(0x382e5e));


        enter.setBounds(350, 275, 300, 75);
        enter.setBorder(BorderFactory.createEmptyBorder());
        enter.setFont(new Font("Ink Free", Font.BOLD, 35)); //its font and size
        enter.setBackground(new Color(0xc64145));
        enter.setForeground(Color.WHITE);
        enter.addActionListener(this);
        enter.setFocusable(false);

        frame.add(instruction);
        frame.add(passwordField);
        frame.add(enter);

        frame.setTitle("CodSoft Bank Of India"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(1020, 600); //window size
        frame.getContentPane().setBackground(new Color(0x382e5e));
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line


    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==enter)
        {
            String t = String.valueOf(passwordField.getPassword());
            int p = Integer.parseInt(t);
            if(p != pin)
            {

                instruction.setText("Please Enter Correct Pin");
                System.out.println(t);

            }
            else if(p == pin)
            {
                userInterface ui = new userInterface();
                frame.dispose();
            }

        }
    }
}
