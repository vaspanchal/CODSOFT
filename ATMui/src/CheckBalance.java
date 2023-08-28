import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBalance implements ActionListener {
    JFrame frame = new JFrame();
    JLabel message = new JLabel();
    JLabel bal = new JLabel();
    JButton okay = new JButton();
    CheckBalance()
    {
        message.setText("CURRENT BALANCE");
        message.setBounds(150, 180, 700, 75);
        message.setBorder(BorderFactory.createEmptyBorder());
        message.setFont(new Font("verdana", Font.BOLD, 25)); //its font
        message.setForeground(Color.WHITE);
        message.setHorizontalAlignment(JTextField.CENTER);

        Balance balance = new Balance();

        bal.setText("₹"+String.valueOf(balance.balance));
        bal.setBounds(150, 250, 700, 75);
        bal.setBorder(BorderFactory.createEmptyBorder());
        bal.setFont(new Font("verdana", Font.PLAIN, 60)); //its font
        bal.setForeground(Color.WHITE);
        bal.setHorizontalAlignment(JTextField.CENTER);

        okay.setText("OKAY");
        okay.setBounds(400,350,200,50);
        okay.setBorder(BorderFactory.createLineBorder(new Color(0x382e5e),5));
        okay.setFont(new Font("ink free",Font.BOLD, 30));
        okay.setForeground(new Color(0x382e5e));
        okay.setBackground(Color.WHITE);
        okay.addActionListener(this);
        okay.setFocusable(false);


        frame.add(bal);
        frame.add(message);
        frame.add(okay);

        frame.setTitle("CodSoft Bank Of India"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(1020, 600); //window size
        frame.getContentPane().setBackground(new Color(0x382e5e));
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okay)
        {
            userInterface ui = new userInterface();
            frame.dispose();
        }

    }
}
