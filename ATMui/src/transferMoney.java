import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class transferMoney implements ActionListener {

    JFrame frame2 = new JFrame();
    // initial interface
    JLabel Instruction1 = new JLabel();
    JLabel Instruction2 = new JLabel();
    JTextField reciever = new JTextField();
    JTextField amount = new JTextField();
    JButton send = new JButton("SEND");

    transferMoney()
    {
        Instruction1.setText("ENTER A/C NO or UPI ID OF RECIEVER");
        Instruction1.setBounds(150,50,700,75);
        Instruction1.setBorder(BorderFactory.createEmptyBorder());
        Instruction1.setFont(new Font("verdana",Font.ITALIC, 30)); //its font
        Instruction1.setForeground(Color.WHITE);
        Instruction1.setHorizontalAlignment(JTextField.CENTER);

        //input textfield
        reciever.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        reciever.setBounds(270,125,450,75); //x-cord, y-cord, width, height of field
        reciever.setFont(new Font("ink free",Font.BOLD, 30));
        reciever.setForeground(new Color(0x382e5e));

        Instruction2.setText("ENTER AMOUNT");
        Instruction2.setBounds(150,225,700,75);
        Instruction2.setBorder(BorderFactory.createEmptyBorder());
        Instruction2.setFont(new Font("verdana",Font.ITALIC, 30)); //its font
        Instruction2.setForeground(Color.WHITE);
        Instruction2.setHorizontalAlignment(JTextField.CENTER);

        amount.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        amount.setBounds(270,300,450,75); //x-cord, y-cord, width, height of field
        amount.setFont(new Font("ink free",Font.BOLD, 30));
        amount.setForeground(new Color(0x382e5e));

        send.setBounds(350,450,300,75);
        send.setBorder(BorderFactory.createEmptyBorder());
        send.setFont(new Font("Ink Free",Font.BOLD,35)); //its font and size
        send.setBackground(new Color(0xc64145));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFocusable(false);

        frame2.add(Instruction1);
        frame2.add(Instruction2);
        frame2.add(amount);
        frame2.add(reciever);
        frame2.add(send);


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
        if(e.getSource()==send)
        {
            int amt = Integer.parseInt(amount.getText());

            Balance bal = new Balance();
            if(amt > bal.balance)
            {
                Insufficient insufficient = new Insufficient();
                frame2.dispose();
            }
            else {
                confirmation confirm = new confirmation();
                bal.balance -= amt;
                frame2.dispose();
            }



        }
    }
}
