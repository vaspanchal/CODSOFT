import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Insufficient implements ActionListener {
    JFrame frame = new JFrame();
    JLabel message = new JLabel();
    JLabel message2 = new JLabel();

    JButton okay = new JButton();

    Insufficient()
    {
        message.setText("TRANSACTION DECLINED!");
        message.setBounds(150, 200, 700, 75);
        message.setBorder(BorderFactory.createEmptyBorder());
        message.setFont(new Font("verdana", Font.BOLD, 40)); //its font
        message.setForeground(Color.WHITE);
        message.setHorizontalAlignment(JTextField.CENTER);

        Balance bal = new Balance();
        message2.setText("Current Balance: ₹"+bal.balance);
        message2.setBounds(150, 250, 700, 75);
        message2.setBorder(BorderFactory.createEmptyBorder());
        message2.setFont(new Font("verdana", Font.PLAIN, 25)); //its font
        message2.setForeground(Color.WHITE);
        message2.setHorizontalAlignment(JTextField.CENTER);

        okay.setText("OKAY");
        okay.setBounds(400,350,200,50);
        okay.setBorder(BorderFactory.createLineBorder(new Color(0xc64145),5));
        okay.setFont(new Font("ink free",Font.BOLD, 30));
        okay.setForeground(new Color(0xc64145));
        okay.setBackground(Color.WHITE);
        okay.addActionListener(this);
        okay.setFocusable(false);

        frame.add(message);
        frame.add(message2);
        frame.add(okay);
        frame.setTitle("CodSoft Bank Of India"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(1020, 600); //window size
        frame.getContentPane().setBackground(new Color(0xc64145));
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == okay)
        {
            userInterface ui = new userInterface();
            frame.dispose();
        }
    }
}
