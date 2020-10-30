import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JLabel secondLabel;
  JLabel thirdLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField thirdInput;

  JButton add;
  JButton sub;
  JButton mul;
  JButton div;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Multiplication");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    // create the side labels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    thirdLabel = new JLabel("Result");

    // set the size and location of the labels
    firstLabel.setBounds(10, 10, 200, 20);
    secondLabel.setBounds(10, 40, 200, 20);
    thirdLabel.setBounds(10, 70, 200, 20);

    // initialize the text fields
    firstInput = new JTextField();
    secondInput = new JTextField();
    thirdInput = new JTextField();

    // set the location and size of text field
    firstInput.setBounds(220, 10, 100, 20);
    secondInput.setBounds(220, 40, 100, 20);
    thirdInput.setBounds(220, 70, 100, 20);

    // initialize the buttons
    add = new JButton("Add");
    sub = new JButton("Sub");
    mul = new JButton("Mul");
    div = new JButton("Div");

    // set the location and size of the buttons
    add.setBounds(20, 100, 80, 35);
    sub.setBounds(110, 100, 80, 35);
    mul.setBounds(200, 100, 80, 35);
    div.setBounds(290, 100, 80, 35);

    // add an action listener to the buttons
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);

    // set the action command on the buttons
    add.setActionCommand("add");
    sub.setActionCommand("sub");
    mul.setActionCommand("mul");
    div.setActionCommand("div");

    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(thirdLabel);

    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(thirdInput);

    mainPanel.add(add);
    mainPanel.add(sub);
    mainPanel.add(mul);
    mainPanel.add(div);

    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // do something depending on what button was pressed
    if(command.equals("add")){
      // get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNum = Integer.parseInt(firstText);
      int secondNum = Integer.parseInt(secondText);

      // add the two numbers
      int addAnswer = firstNum + secondNum;
      // show the user the answer
      thirdInput.setText("" + addAnswer);
    }else if(command.equals("sub")){
      // get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNum = Integer.parseInt(firstText);
      int secondNum = Integer.parseInt(secondText);

      // subtract the second number from the first number
      int subAnswer = firstNum - secondNum;
      // show the user the answer
      thirdInput.setText("" + subAnswer);
    }else if(command.equals("mul")){
      // get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNum = Integer.parseInt(firstText);
      int secondNum = Integer.parseInt(secondText);

      // multiply the two numbers
      int mulAnswer = firstNum * secondNum;
      // show the answer
      thirdInput.setText("" + mulAnswer);
    }else if(command.equals("div")){
      // get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstNum = Integer.parseInt(firstText);
      int secondNum = Integer.parseInt(secondText);

      // divide the two numbers 
      double divAnswer = firstNum / secondNum;
      // show the answer
      thirdInput.setText("" + divAnswer);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
