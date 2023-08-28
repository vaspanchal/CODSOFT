import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawal implements ActionListener {
    JFrame frame = new JFrame();
    // initial interface
    JLabel instruction = new JLabel();
    JTextField amount = new JTextField();
    JButton withdraw = new JButton("WITHDRAW");

    Withdrawal()
    {
        instruction.setText("ENTER AMOUNT");
        instruction.setBounds(150, 50, 700, 75);
        instruction.setBorder(BorderFactory.createEmptyBorder());
        instruction.setFont(new Font("verdana", Font.PLAIN, 30)); //its font
        instruction.setForeground(Color.WHITE);
        instruction.setHorizontalAlignment(JTextField.CENTER);

        //input textfield
        amount.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        amount.setBounds(270, 150, 450, 75); //x-cord, y-cord, width, height of field
        amount.setFont(new Font("ink free",Font.BOLD, 30));
        amount.setForeground(new Color(0x382e5e));




        withdraw.setBounds(350, 275, 300, 75);
        withdraw.setBorder(BorderFactory.createEmptyBorder());
        withdraw.setFont(new Font("ink free",Font.BOLD, 30));
        withdraw.setBackground(new Color(0xc64145));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        withdraw.setFocusable(false);

        frame.add(instruction);
        frame.add(amount);
        frame.add(withdraw);

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
        if (e.getSource() == withdraw)
        {
            int amt = Integer.parseInt(amount.getText());
            Balance bal = new Balance();

            if(amt > bal.balance || amt < 0)
            {
                Insufficient insufficient = new Insufficient();
                frame.dispose();
            }
            else
            {
                confirmation confirm = new confirmation();
                bal.balance -= amt;
                frame.dispose();
            }



        }
    }
}
