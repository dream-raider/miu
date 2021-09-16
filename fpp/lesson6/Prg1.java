package lesson6;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Erika
 *
 *         This class allows user to enter name, street, city, state, zip and
 *         print the entered value in the console
 */
@SuppressWarnings("serial")
public class Prg1 extends JFrame {

	// three panels which will contain all the elements to display according to
	// different rows
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;

	// label and textfield panels
	private JPanel namePanel;
	private JPanel streetPanel;
	private JPanel cityPanel;
	private JPanel statePanel;
	private JPanel zipPanel;

	// text field
	private JTextField nameText;
	private JTextField streetText;
	private JTextField cityText;
	private JTextField stateText;
	private JTextField zipText;

	// labels
	private JLabel nameLabel;
	private JLabel streetLabel;
	private JLabel cityLabel;
	private JLabel stateLabel;
	private JLabel zipLabel;

	private JButton submitBtn;

	public Prg1() {
		initializeWindow();

		// main panel in which all other panels will be added
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineBottomPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);

	}

	private void initializeWindow() {
		// application closes when clicked on X mark on top right
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// title seen on the top left of the application
		setTitle("Address Form");
		centerFrameOnDesktop(this);
		setSize(500, 200);
		// user cannot resize the screen
		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		defineTopPanelContent();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		defineMiddlePanelContent();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	}

	private void defineBottomPanel() {
		bottomPanel = new JPanel();
		defineBottomPanelContent();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	}

	// button and its action as a lambda expression
	private void defineBottomPanelContent() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		submitBtn = new JButton("Submit");
		bottomPanel.add(submitBtn);

		submitBtn.addActionListener(event -> {
			System.out.println(nameText.getText());
			System.out.println(streetText.getText());
			System.out.println(cityText.getText() + ", " + stateText.getText() + " " + zipText.getText());

		});
	}

	// name,street,city label and text field
	private void defineTopPanelContent() {
		namePanel = new JPanel();
		streetPanel = new JPanel();
		cityPanel = new JPanel();

		namePanel.setLayout(new BorderLayout());
		streetPanel.setLayout(new BorderLayout());
		cityPanel.setLayout(new BorderLayout());

		nameText = new JTextField(10);
		streetText = new JTextField(10);
		cityText = new JTextField(10);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(makeSmallFont(nameLabel.getFont()));
		namePanel.add(nameLabel, BorderLayout.NORTH);
		namePanel.add(nameText, BorderLayout.CENTER);

		streetLabel = new JLabel("Street");
		streetLabel.setFont(makeSmallFont(streetLabel.getFont()));
		streetPanel.add(streetLabel, BorderLayout.NORTH);
		streetPanel.add(streetText, BorderLayout.CENTER);

		cityLabel = new JLabel("city");
		cityLabel.setFont(makeSmallFont(cityLabel.getFont()));
		cityPanel.add(cityLabel, BorderLayout.NORTH);
		cityPanel.add(cityText, BorderLayout.CENTER);

		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		topPanel.add(namePanel);
		topPanel.add(streetPanel);
		topPanel.add(cityPanel);
	}

	// state and zip label and textfield
	private void defineMiddlePanelContent() {

		statePanel = new JPanel();
		zipPanel = new JPanel();

		statePanel.setLayout(new BorderLayout());
		zipPanel.setLayout(new BorderLayout());

		stateText = new JTextField(10);
		zipText = new JTextField(10);

		stateLabel = new JLabel("State");
		stateLabel.setFont(makeSmallFont(stateLabel.getFont()));
		statePanel.add(stateLabel, BorderLayout.NORTH);
		statePanel.add(stateText, BorderLayout.CENTER);

		zipLabel = new JLabel("Zip");
		zipLabel.setFont(makeSmallFont(zipLabel.getFont()));
		zipPanel.add(zipLabel, BorderLayout.NORTH);
		zipPanel.add(zipText, BorderLayout.CENTER);

		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		middlePanel.add(statePanel);
		middlePanel.add(zipPanel);
	}

	// sizing the font
	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Prg1 mf = new Prg1();
				// setting the visibility
				mf.setVisible(true);
			}
		});
	}

}
