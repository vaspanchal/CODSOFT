import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposit implements ActionListener {
    public static int amount = 0;
    JFrame frame = new JFrame();
    JLabel instruction = new JLabel();
    JButton amt1 = new JButton("₹10"); // creates withdrawal button
    JButton amt2 = new JButton("₹20"); // creates deposit button
    JButton amt3 = new JButton("₹50"); // creates fast withfraw button
    JButton amt4 = new JButton("₹100");

    JButton amt5 = new JButton("₹200"); // creates fast withfraw button
    JButton amt6 = new JButton("₹500");
    JButton deposit = new JButton();



    deposit()
    {
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);
        instruction.setBounds(50,50,900,75);
        instruction.setBorder(BorderFactory.createEmptyBorder());
        instruction.setFont(new Font("verdana",Font.PLAIN, 30)); //its font
        instruction.setForeground(Color.WHITE);
        instruction.setHorizontalAlignment(JTextField.CENTER);

        amt1.setBounds(50,150,425,75);
        amt1.setBorder(BorderFactory.createEmptyBorder());
        amt1.setFont(new Font("ink free",Font.BOLD, 30)); //its font
        amt1.setBackground(new Color(0xc64145));
        amt1.setForeground(Color.WHITE);
        amt1.addActionListener(this);
        amt1.setFocusable(false);

        amt2.setBounds(525,150,425,75);
        amt2.setBorder(BorderFactory.createEmptyBorder());
        amt2.setFont(new Font("ink free",Font.BOLD, 30));
        amt2.setBackground(new Color(0xc64145));
        amt2.setForeground(Color.WHITE);
        amt2.addActionListener(this);
        amt2.setFocusable(false);

        amt3.setBounds(50,275,425,75);
        amt3.setBorder(BorderFactory.createEmptyBorder());
        amt3.setFont(new Font("ink free",Font.BOLD, 30));
        amt3.setBackground(new Color(0xc64145));
        amt3.setForeground(Color.WHITE);
        amt3.addActionListener(this);
        amt3.setFocusable(false);

        amt4.setBounds(525,275,425,75);
        amt4.setBorder(BorderFactory.createEmptyBorder());
        amt4.setFont(new Font("ink free",Font.BOLD, 30));
        amt4.setBackground(new Color(0xc64145));
        amt4.setForeground(Color.WHITE);
        amt4.addActionListener(this);
        amt4.setFocusable(false);


        amt5.setBounds(50,400,425,75);
        amt5.setBorder(BorderFactory.createEmptyBorder());
        amt5.setFont(new Font("ink free",Font.BOLD, 30));
        amt5.setBackground(new Color(0xc64145));
        amt5.setForeground(Color.WHITE);
        amt5.addActionListener(this);
        amt5.setFocusable(false);

        amt6.setBounds(525,400,425,75);
        amt6.setBorder(BorderFactory.createEmptyBorder());
        amt6.setFont(new Font("ink free",Font.BOLD, 30));
        amt6.setBackground(new Color(0xc64145));
        amt6.setForeground(Color.WHITE);
        amt6.addActionListener(this);
        amt6.setFocusable(false);

        deposit.setText("DEPOSIT");
        deposit.setBounds(400,500,200,50);
        deposit.setBorder(BorderFactory.createLineBorder(new Color(0xc64145),5));
        deposit.setFont(new Font("ink free",Font.BOLD, 30));
        deposit.setForeground(new Color(0xc64145));
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        deposit.setFocusable(false);


        frame.add(instruction);
        frame.add(amt1);
        frame.add(amt2);
        frame.add(amt3);
        frame.add(amt4);
        frame.add(amt5);
        frame.add(amt6);
        frame.add(deposit);

        frame.setTitle("CodSoft Bank Of India"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(1020,600); //window size
        frame.getContentPane().setBackground(new Color(0x382e5e));
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == amt1)
        {
            amount+=10;
            instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

        }if (e.getSource() == amt2)
    {
        amount+=20;
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

    }if (e.getSource() == amt3)
    {
        amount+=50;
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

    }if (e.getSource() == amt4)
    {
        amount+=100;
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

    }if (e.getSource() == amt5)
    {
        amount+=200;
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

    }if (e.getSource() == amt6)
    {
        amount+=500;
        instruction.setText("PLEASE SELECT DENOMINATIONS OF AMOUNT: ₹"+amount);

    }
        if (e.getSource() == deposit)
        {
            confirmation confirm = new confirmation();
            Balance bal = new Balance();
            bal.balance += amount;
            System.out.println(bal.balance);
            frame.dispose();
            amount = 0;
        }

    }




}
