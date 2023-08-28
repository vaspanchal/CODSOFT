import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class userInterface implements ActionListener {

    //main frame
    JFrame frame = new JFrame();

    // interface after access
    JLabel instruction = new JLabel("PLEASE CHOOSE AN OPTION TO CONTINUE");
    JButton withdrawal = new JButton("WITHDRAWAL"); // creates withdrawal button
    JButton deposit = new JButton("DEPOSIT"); // creates deposit button
    JButton fastCash = new JButton("FAST CASH"); // creates fast withfraw button
    JButton transferMoney = new JButton("TRANSFER MONEY");

    JButton checkBal = new JButton("CHECK BALANCE"); // creates fast withfraw button
    JButton changePin = new JButton("CHANGE PIN");


    userInterface()
    {


        instruction.setBounds(150,50,700,75);
        instruction.setBorder(BorderFactory.createEmptyBorder());
        instruction.setFont(new Font("verdana",Font.PLAIN, 30)); //its font
        instruction.setForeground(Color.WHITE);
        instruction.setHorizontalAlignment(JTextField.CENTER);



        fastCash.setBounds(50,150,425,75);
        fastCash.setBorder(BorderFactory.createEmptyBorder());
        fastCash.setFont(new Font("ink free",Font.ITALIC, 30));
        fastCash.setBackground(new Color(0xc64145));
        fastCash.setForeground(Color.WHITE);
        fastCash.addActionListener(this);
        fastCash.setFocusable(false);

        deposit.setBounds(525,150,425,75);
        deposit.setBorder(BorderFactory.createEmptyBorder());
        deposit.setFont(new Font("ink free",Font.ITALIC, 30));
        deposit.setBackground(new Color(0xc64145));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        deposit.setFocusable(false);

        withdrawal.setBounds(50,275,425,75);
        withdrawal.setBorder(BorderFactory.createEmptyBorder());
        withdrawal.setFont(new Font("ink free",Font.ITALIC, 30));
        withdrawal.setBackground(new Color(0xc64145));
        withdrawal.setForeground(Color.WHITE);
        withdrawal.addActionListener(this);
        withdrawal.setFocusable(false);

        transferMoney.setBounds(525,275,425,75);
        transferMoney.setBorder(BorderFactory.createEmptyBorder());
        transferMoney.setFont(new Font("ink free",Font.ITALIC, 30));
        transferMoney.setBackground(new Color(0xc64145));
        transferMoney.setForeground(Color.WHITE);
        transferMoney.addActionListener(this);
        transferMoney.setFocusable(false);

        checkBal.setBounds(50,400,425,75);
        checkBal.setBorder(BorderFactory.createEmptyBorder());
        checkBal.setFont(new Font("ink free",Font.ITALIC, 30));
        checkBal.setBackground(new Color(0xc64145));
        checkBal.setForeground(Color.WHITE);
        checkBal.addActionListener(this);
        checkBal.setFocusable(false);

        changePin.setBounds(525,400,425,75);
        changePin.setBorder(BorderFactory.createEmptyBorder());
        changePin.setFont(new Font("ink free",Font.ITALIC, 30));
        changePin.setBackground(new Color(0xc64145));
        changePin.setForeground(Color.WHITE);
        changePin.addActionListener(this);
        changePin.setFocusable(false);


        frame.add(checkBal);
        frame.add(changePin);
        frame.add(withdrawal);
        frame.add(fastCash);
        frame.add(deposit);
        frame.add(transferMoney);
        frame.add(instruction);
        frame.setTitle("CodSoft Bank Of India"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(1020,600); //window size
        frame.getContentPane().setBackground(new Color(0x382e5e));
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line
    }


    @Override
    public void actionPerformed(ActionEvent e) //overriding actionPerformed function to get the action taken by user and its output
    {
        if (e.getSource() == fastCash)
        {
            fastCash fc = new fastCash();
            frame.dispose();
        }
        if (e.getSource() == deposit)
        {
            deposit dp = new deposit();
            frame.dispose();
        }
        if (e.getSource() == checkBal)
        {
            CheckBalance cb = new CheckBalance();
            frame.dispose();
        }
        if (e.getSource()==withdrawal)
        {
            Withdrawal withdraw = new Withdrawal();
            frame.dispose();
        }
        if (e.getSource() == transferMoney)
        {
            transferMoney tm = new transferMoney();
            frame.dispose();
        }

        if (e.getSource()==changePin)
        {
            changePin cp = new changePin();
            frame.dispose();
        }
    }
}