package lesson6.prg2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prg2 extends JFrame {

	// Defining JButtons
	private JButton countBtn;
	private JButton reverseBtn;
	private JButton removeBtn;

	// Defining JTextField
	private JTextField inputText;
	private JTextField outputText;

	// Setting default size of the window
	public static final int DEFAULT_WIDTH = 800;
	public static final int DEFAULT_HEIGHT = 250;

	public Prg2() {
		initializeWindow();
		// change the background color of the frame
		getContentPane().setBackground(new Color(238, 238, 238));
		getContentPane().setLayout(null);

		createElement();

		// add to the frame
		add(countBtn);
		add(reverseBtn);
		add(removeBtn);
		add(inputText);
		add(outputText);

		// Inner class event handling for 3 Buttons
		Prg2.ButtonHandler btnHandler = new Prg2.ButtonHandler();
		countBtn.addActionListener(btnHandler);
		reverseBtn.addActionListener(btnHandler);
		removeBtn.addActionListener(btnHandler);
	}

	private void createElement() {
		// Initialization
		countBtn = new JButton("Count Letters");
		countBtn.setBounds(110, 20, 250, 40);
		countBtn.setFont(new Font("Arial", Font.BOLD, 17));

		reverseBtn = new JButton("Reverse Letters");
		reverseBtn.setBounds(110, 70, 250, 40);
		reverseBtn.setFont(new Font("Arial", Font.BOLD, 17));

		removeBtn = new JButton("Remove Duplicates");
		removeBtn.setBounds(110, 120, 250, 40);
		removeBtn.setFont(new Font("Arial", Font.BOLD, 17));

		// Defining JLabel
		JLabel inputLabel = new JLabel("Input"); // lblInput defined as local variable inside constructor because it is
													// not further used
		inputLabel.setBounds(380, 30, 300, 20);
		inputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		inputText = new JTextField(6);
		inputText.setBounds(380, 55, 300, 25);

		JLabel outputLabel = new JLabel("Output"); // lblOutput defined as local variable inside constructor because it
													// is
													// not further used
		outputLabel.setBounds(380, 85, 300, 20);
		outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		outputText = new JTextField(6);
		outputText.setBounds(380, 110, 300, 25);

		// add label elements
		add(inputLabel);
		add(outputLabel);
	}

	// define event handling inner class for button handler
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String userInputData = inputText.getText();
			if (event.getSource() == countBtn) { // count button pressed
				outputText.setText(String.format("%d", userInputData.length()));
			} else if (event.getSource() == reverseBtn) { // reverse button pressed
				outputText.setText(reverse(userInputData));
			} else if (event.getSource() == removeBtn) { // or simply else{ handle remDups }
				outputText.setText(removeDuplicates(userInputData));
			}
		}

		public String reverse(String str) { // returns reverse of a string
			if (str == null || str.length() == 1) // return str if it is null or has size 1
				return str;
			else {
				StringBuilder sbStr = new StringBuilder(str);
				sbStr.reverse(); // reverse the string
				return sbStr.toString(); // convert StringBuilder to String and return
			}
		}

		public String removeDuplicates(String str) { // removeDuplicates method definition
			StringBuilder sb = new StringBuilder(); // StringBuilder object
			IntStream is = str.chars().distinct(); // get distinct characters from str
			is.forEach(c -> sb.append((char) c)); // add each character to string builder object
			return sb.toString(); // convert string builder object to String and return
		}
	}

	private void initializeWindow() {
		setTitle("String Utility");

		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	// main function
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Prg2 mf = new Prg2();
				// setting the visibility
				mf.setVisible(true);
			}
		});
	}

}