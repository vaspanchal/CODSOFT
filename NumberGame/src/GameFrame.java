import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Random;

public class GameFrame implements ActionListener {
    
    // creating instances of necessary classes
    JFrame frame = new JFrame(); //main frame
    JButton submitButton = new JButton("SUBMIT"); // creates submit button
    JButton restartButton = new JButton("RESTART"); // creates restart button
    JLabel label = new JLabel(); //creates top label

    NumberFormat longFormat = NumberFormat.getIntegerInstance(); //selection of formay

    NumberFormatter numberFormatter = new NumberFormatter(longFormat); //creates a number format object

    JFormattedTextField textField = new JFormattedTextField(numberFormatter); //creates input textfield


    JLabel messageLabel = new JLabel(); //creates a result message label

    int score = 0; //instantiating score of player
    JLabel scoreLabel = new JLabel("Your Score: 0"); //create scorecard label

    JLabel instructions = new JLabel(); //creates instructions label


    Random random = new Random(); //creates a random insttance
    int key = random.nextInt(1,100); //generates a number between [1,100)

    GameFrame() //main window
    {
        //top label
        label.setText("Guess A Number Between 1-99"); //test which will show on screen
        label.setBounds(new Rectangle(400,50)); // label dimensions
        label.setFont(new Font("verdana",Font.BOLD, 21)); //its font
        label.setBorder(BorderFactory.createEmptyBorder()); //creates an invisible border
        label.setOpaque(true); //dont show background things
        label.setHorizontalAlignment(JTextField.CENTER); //keeps the label in center

        //input textfield
        numberFormatter.setAllowsInvalid(false); //doesnt allow invalid input
        numberFormatter.setMinimum(1); //minimum input value = 1
        numberFormatter.setMaximum(99); //maximum input value = 99
        textField.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        textField.setBounds(75,50,250,45); //x-cord, y-cord, width, height of field

        //submit button
        submitButton.setBounds(75,105,100,25); //dimensions and position of buton
        submitButton.setFont(new Font("Ink Free",Font.BOLD,14)); //its font and size
        submitButton.setFocusable(false); //
        submitButton.addActionListener(this); //action performed input
        submitButton.setForeground(Color.WHITE); //text color
        submitButton.setBackground(Color.black); //background color
        
        //restart button
        restartButton.setBounds(225,105,100,25); //dim. and pos. of button
        restartButton.setFont(new Font("Ink Free",Font.BOLD,14)); //its font and size
        restartButton.setFocusable(false); //
        restartButton.addActionListener(this);
        restartButton.setForeground(Color.WHITE);
        restartButton.setBackground(Color.black);

        //result message label
        messageLabel.setBounds(0,150,400,50);
        messageLabel.setBorder(BorderFactory.createBevelBorder(1));
        messageLabel.setFont(new Font("Ink Free",Font.ITALIC,21));
        messageLabel.setHorizontalAlignment(JTextField.CENTER);

        //score card
        scoreLabel.setBounds(115,200,225,50);
        scoreLabel.setBorder(BorderFactory.createEmptyBorder());
        scoreLabel.setFont(new Font("MonoSpace",Font.BOLD,25));

        //instruction label
        instructions.setText("<html>Instructions:<br>> Guess any number between 1 and 99 (inclusive)<br>" +
                "> if difference between guess and generated number is > 30 : -20 points<br>" +
                "> if difference is less than 30, but not correct : -5 point<br>" +
                "> if difference is less than 10, but not correct : -1 points<br>" +
                "> correct guess : +100 points<br>" +
                "> On every retry, a new number will be generated<br>" +
                "> Try to score as high as possible!</html>");
        instructions.setBounds(0,260,400,110);
        instructions.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        instructions.setFont(new Font("Ink Free",Font.PLAIN,10));
        instructions.setHorizontalAlignment(JTextField.CENTER);

        //adding all components to our main frame window
        frame.add(instructions);
        frame.add(scoreLabel);
        frame.add(messageLabel);
        frame.add(submitButton);
        frame.add(restartButton);
        frame.add(label);
        frame.add(textField);
        frame.setTitle("Number Game"); //window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(420,420); //window size
        frame.setLayout(null); //no label layout used
        frame.setResizable(false); //window is not resizeable
        frame.setVisible(true); //last line
    }

    @Override
    public void actionPerformed(ActionEvent e) //overriding actionPerformed function to get the action taken by user and its output
    {
        if(e.getSource() == restartButton)
        {
            retry();
        }
        if(e.getSource() == submitButton)
        {
            submit();

        }
    }


    void submit()
    {
        int guess = Integer.parseInt(textField.getText());

        if(guess == key) //guess is correct
        {
            messageLabel.setBackground(Color.GREEN);
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("Congratulations! That's correct guess..");
            score+=100; //increments 100 score
            scoreLabel.setText("Your Score: "+score);
            restart();

        }

        else if(guess-key >= 30) //guess is 30+ digits higher than the number
        {
            messageLabel.setBackground(Color.RED);
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("Well Try, But it is Too High!");
            score -= 20; //deduct 20 points
            //scoreLabel.setText("Your Score: "+score);
            reattempt();
        }

        else if(key-guess >= 30) //guess is 30+ digits less than the number
        {
            messageLabel.setBackground(Color.RED);
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("Well Try, But it is Too Low!");
            score -= 20; //deduct 20 points
            //scoreLabel.setText("Your Score: "+score);
            reattempt();
        } else if (Math.abs(key-guess) < 10) //guess is near the 10 numbers of key
        {
            messageLabel.setBackground(Color.yellow);
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("It Was Very Close! Try Again...");
            score -= 1; //deduct 1 point
            //scoreLabel.setText("Your Score: "+score);
            reattempt();
        }
        else
        {
            messageLabel.setBackground(Color.ORANGE);
            messageLabel.setForeground(Color.BLACK);
            messageLabel.setText("It Was Close, Better Luck Next Time...");
            score-=5; //deduct 5 points
            //scoreLabel.setText("Your Score: "+score);
            reattempt();
        }

    }

    void retry() //restart button
    {
        textField.setValue(null);
        messageLabel.setText("");
        messageLabel.setBackground(Color.WHITE);
        key = random.nextInt(1,100); //genrates key again
        score = 0;
        scoreLabel.setText("Your Score: "+score);
    }

    void reattempt()
    {
        textField.setValue(null); //sets the input field to null

    }

    void restart() //when person wins, it restarts automatically
    {
        textField.setValue(null);
        key = random.nextInt(1,100); //generates key again
    }

}
