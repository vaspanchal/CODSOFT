import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainWindow implements ActionListener
{
    //creating frame here
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JButton fileButton = new JButton("or select file");
    JButton goButton = new JButton("Go");

    JLabel statistics = new JLabel();
    //creating table with labels
    JLabel c1r1 = new JLabel();

    JLabel c1r2 = new JLabel();
    JLabel c1r3 = new JLabel();
    JLabel c1r4 = new JLabel();
    JLabel c2r1 = new JLabel();
    JLabel c2r2 = new JLabel();
    JLabel c2r3 = new JLabel();
    JLabel c2r4 = new JLabel();
    JLabel c3r1 = new JLabel();
    JLabel c3r2 = new JLabel();
    JLabel c3r3 = new JLabel();
    JLabel c3r4 = new JLabel();


    JFrame except = new JFrame();
    JLabel exceptLabel = new JLabel("404: FILE NOT FOUND!");

    MainWindow()
    {
        //input text field
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER); //keeps the box in center
        textField.setBounds(0,20,380,40); //x-cord, y-cord, width, height of field

        //file opening button
        fileButton.setBounds(90,70,120,25);
        fileButton.setHorizontalAlignment(JButton.CENTER);
        fileButton.setBorder(BorderFactory.createLineBorder(Color.cyan,1));
        fileButton.addActionListener(this);
        fileButton.setFocusable(false); //removes the focusing border from button
        fileButton.setForeground(Color.cyan); //text color
        fileButton.setBackground(Color.black); //background color

        // text submit button or go button
        goButton.setBounds(220,70,69,25);
        goButton.setHorizontalAlignment(JButton.CENTER);
        goButton.setBorder(BorderFactory.createLineBorder(Color.cyan,1));
        goButton.addActionListener(this);
        goButton.setFocusable(false); //removes the focusing border from button
        goButton.setForeground(Color.cyan); //text color
        goButton.setBackground(Color.black); //background color

        // stat label
        statistics.setText("<html><h3>Statistics of provided text</h3></html>");
        statistics.setBounds(89,110,200,45);
        statistics.setHorizontalAlignment(JLabel.CENTER);
        statistics.setBorder(BorderFactory.createLineBorder(Color.black,2));
        statistics.setBackground(Color.CYAN);
        statistics.setOpaque(true);

        // column 1
        c1r1.setText("Insights");
        c1r1.setBounds(0,170,170,30);
        c1r1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c1r1.setFont(new Font("Ink Free",Font.BOLD,14));
        c1r1.setHorizontalAlignment(JLabel.CENTER);
        c1r1.setOpaque(true);

        c1r2.setText("Total Characters");
        c1r2.setBounds(0,199,170,30);
        c1r2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c1r2.setHorizontalAlignment(JLabel.CENTER);
        c1r2.setOpaque(true);

        c1r3.setText("Total Words");
        c1r3.setBounds(0,228,170,30);
        c1r3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c1r3.setHorizontalAlignment(JLabel.CENTER);
        c1r3.setOpaque(true);


        c1r4.setText("Most Frequent Word Used");
        c1r4.setBounds(0,257,170,30);
        c1r4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c1r4.setHorizontalAlignment(JLabel.CENTER);
        c1r4.setOpaque(true);


        //column 2
        c2r1.setText("Word");
        c2r1.setBounds(169,170,106,30);
        c2r1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c2r1.setFont(new Font("Ink Free",Font.BOLD,14));
        c2r1.setHorizontalAlignment(JLabel.CENTER);
        c2r1.setOpaque(true);

        c2r2.setText("-");
        c2r2.setBounds(169,199,106,30);
        c2r2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c2r2.setFont(new Font("Ink Free",Font.BOLD,14));
        c2r2.setHorizontalAlignment(JLabel.CENTER);
        c2r2.setOpaque(true);

        c2r3.setText("-");
        c2r3.setBounds(169,228,106,30);
        c2r3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c2r3.setFont(new Font("Ink Free",Font.BOLD,14));
        c2r3.setHorizontalAlignment(JLabel.CENTER);
        c2r3.setOpaque(true);

        c2r4.setBounds(169,257,106,30);
        c2r4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c2r4.setFont(new Font("Ink Free",Font.BOLD,14));
        c2r4.setHorizontalAlignment(JLabel.CENTER);
        c2r4.setOpaque(true);

        //column 3
        c3r1.setText("Frequency");
        c3r1.setBounds(274,170,110,30);
        c3r1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c3r1.setFont(new Font("Ink Free",Font.BOLD,14));
        c3r1.setHorizontalAlignment(JLabel.CENTER);
        c3r1.setOpaque(true);

        c3r2.setBounds(274,199,110,30);
        c3r2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c3r2.setFont(new Font("Ink Free",Font.BOLD,14));
        c3r2.setHorizontalAlignment(JLabel.CENTER);
        c3r2.setOpaque(true);

        c3r3.setBounds(274,228,110,30);
        c3r3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c3r3.setFont(new Font("Ink Free",Font.BOLD,14));
        c3r3.setHorizontalAlignment(JLabel.CENTER);
        c3r3.setOpaque(true);

        c3r4.setBounds(274,257,110,30);
        c3r4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        c3r4.setFont(new Font("Ink Free",Font.BOLD,14));
        c3r4.setHorizontalAlignment(JLabel.CENTER);
        c3r4.setOpaque(true);
        
        //main frame properties
        frame.add(c1r1);
        frame.add(c1r2);
        frame.add(c1r3);
        frame.add(c1r4);
        frame.add(c2r1);
        frame.add(c2r2);
        frame.add(c2r3);
        frame.add(c2r4);
        frame.add(c3r1);
        frame.add(c3r2);
        frame.add(c3r3);
        frame.add(c3r4);
        frame.add(goButton);
        frame.add(fileButton);
        frame.add(statistics);
        frame.add(textField);
        frame.setTitle("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        frame.setSize(400,340);
        frame.getContentPane().setBackground(new Color(0xAFEEEE));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);


        exceptLabel.setBounds(0,0,200,100);
        exceptLabel.setHorizontalAlignment(JLabel.CENTER);
        exceptLabel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        exceptLabel.setFont(new Font("Ink Free",Font.BOLD,14));
        exceptLabel.setForeground(Color.WHITE);
        exceptLabel.setBackground(Color.red);
        exceptLabel.setOpaque(true);
        
        except.add(exceptLabel);
        except.setTitle("File Not Found!");
        except.setSize(215,140);
        except.setLayout(null);
        except.setResizable(false);

    }


    @Override
    public void actionPerformed(ActionEvent e) //overriding actionPerformed function to get the action taken by user and its output
    {
        if(e.getSource() == fileButton)
        {
            fileCount();
        }
        if (e.getSource() == goButton)
        {
            textCount();
        }
    }

    JFileChooser fileChooser = new JFileChooser();

    void fileCount()
    {
        int response = fileChooser.showOpenDialog(null); //select file to open, on clicking 'open' = 0; 'close' = 1
        // parent argument (null here) determines :
        // 1. the frame on which the dialog depends
        // 2. component of frame whose position is considered
        // when we put null as argument, it returns the root level frame as parent container

        if(response == JFileChooser.APPROVE_OPTION) //approve_option is same as 0
        {
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //retrieving path of file

            try {
                String line;
                int charCount = 0;
                int wordCount = 0;
                HashMap<String,Integer> wordCountMap = new HashMap<>(); //holds words and their frequency
                String mostRepeatedWord = null;

                int count = 0;



                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);

                //Gets each line till end of file is reached
                while((line = br.readLine()) != null)
                {
                    //counts characters
                    charCount += line.length();
                    //Splits each line into words by identifying spaces between two words
                    String[] words = line.toLowerCase().split(" ");
                    //Counts each word
                    wordCount = wordCount + words.length;

                    //frequency counter
                    for(String word : words)
                    {
                        if(wordCountMap.containsKey(word))
                        {
                            wordCountMap.put(word, wordCountMap.get(word)+1);
                        }

                        //otherwise inserting the word as key and 1 as its value
                        else
                        {
                            wordCountMap.put(word, 1);
                        }
                    }


                    Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

                    for (Map.Entry<String, Integer> entry : entrySet) //help accessing entry from our hashmap
                    {
                        if(entry.getValue() > count)
                        {
                            mostRepeatedWord = entry.getKey();

                            count = entry.getValue();
                        }
                    }


                }

                c2r4.setText(mostRepeatedWord);
                c3r2.setText(String.valueOf(charCount));
                c3r3.setText(String.valueOf(wordCount));
                c3r4.setText(String.valueOf(count));
                br.close();


            }
            catch (FileNotFoundException ex)
            {
                except.setVisible(true);
            }
            catch (IOException ex)
            {
                throw new RuntimeException(ex);
            }

        }


    }

    void textCount()
    {
        String text = textField.getText();

        //count character in string
        int charCount = 0;
        for(int i = 0; i<text.length();i++)
        {
            if(text.charAt(i) != ' ') // \o includes whitespaces while counting whereas using ' ' neglects spaces. I am neglecting spaces here
            {
                charCount++;
            }
        }

        // count words in given string
        int wordCount = text.split("\\s").length; // "\\s" is used to identify whitespaces to split words
        c3r2.setText(String.valueOf(charCount));
        c3r3.setText(String.valueOf(wordCount));

        // most frequent word finder
        HashMap<String,Integer> wordCountMap = new HashMap<>(); //holds words and their frequency
        String mostRepeatedWord = null;
        int count = 0;

        String[] words = text.toLowerCase().split(" ");

        for(String word : words)
        {
            if(wordCountMap.containsKey(word))
            {
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }

            //otherwise inserting the word as key and 1 as its value
            else
            {
                wordCountMap.put(word, 1);
            }
        }


            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

            for (Map.Entry<String, Integer> entry : entrySet) //help accessing entry from our hashmap
            {
                if(entry.getValue() > count)
                {
                    mostRepeatedWord = entry.getKey();

                    count = entry.getValue();
                }
            }
            c2r4.setText(mostRepeatedWord);
            c3r4.setText(String.valueOf(count));


        }





    }


