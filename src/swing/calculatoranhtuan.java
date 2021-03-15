package swing;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class calculatoranhtuan extends JFrame {
	

	private JPanel Calculator;
	private JTextField text;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	double first, second;
	String operation;
	String answer;
	double result;
	
	double num,ans;
	int calculation;
	public void arithmetic() {
		switch(calculation) {
		case 1:
			ans=num+Double.parseDouble(text.getText());
			text.setText(Double.toString(ans));
			break;
		
		case 2:
			ans=num -Double.parseDouble(text.getText());
			text.setText(Double.toString(ans));
			break;
		case 3:
			ans=num * Double.parseDouble(text.getText());
			text.setText(Double.toString(ans));
			break;
		case 4:
			ans=num / Double.parseDouble(text.getText());
			text.setText(Double.toString(ans));
			break;
		}
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatoranhtuan frame = new calculatoranhtuan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public calculatoranhtuan() {
		
		
		
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 600);
		Calculator = new JPanel();
		Calculator.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(86, 21, 331, 57);
		Calculator.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIMPLE CALCULATOR");
		lblNewLabel.setBounds(0, 0, 331, 57);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(null);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("simple calculator program");
		
		text = new JTextField();
		text.setToolTipText("type your value here\n");
		text.setBounds(31, 81, 431, 57);
		Calculator.add(text);
		text.setColumns(10);
		
		JButton but13 = new JButton("+");
		but13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="+";
			}
		});
		but13.setBounds(385, 151, 85, 37);
		Calculator.add(but13);
		
		JButton but12 = new JButton("-");
		but12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="-";
				
			}
		});
		but12.setBounds(385, 200, 85, 37);
		Calculator.add(but12);
		
		JButton but11 = new JButton("X");
		but11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="X";
			}
		});
		but11.setBounds(385, 249, 85, 37);
		Calculator.add(but11);
		
		JButton but10 = new JButton("/");
		but10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="/";
			}
		});
		but10.setBounds(385, 298, 85, 37);
		Calculator.add(but10);
		
		JButton but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"1");
			}
		});
		but1.setBounds(62, 222, 85, 46);
		Calculator.add(but1);
		
		JButton but14 = new JButton("C");
		but14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
			}
		});
		but14.setBounds(224, 156, 85, 54);
		Calculator.add(but14);
		
		
		
		
		JButton but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"2");
			}
		});
		but2.setBounds(172, 222, 85, 46);
		Calculator.add(but2);
		
		JButton but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"3");
			}
		});
		but3.setBounds(288, 222, 85, 46);
		Calculator.add(but3);
		
		JButton but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"4");
			}
		});
		but4.setBounds(62, 280, 85, 46);
		Calculator.add(but4);
		
		JButton but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"5");
			}
		});
		but5.setBounds(172, 280, 85, 46);
		Calculator.add(but5);
		
		JButton but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"6");
			}
		});
		but6.setBounds(288, 280, 85, 46);
		Calculator.add(but6);
		
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"7");
			}
		});
		but7.setBounds(62, 338, 85, 46);
		Calculator.add(but7);
		
		JButton but8 = new JButton("8");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"8");
			}
		});
		but8.setBounds(172, 338, 85, 46);
		Calculator.add(but8);
		
		JButton but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"9");
			}
		});
		but9.setBounds(288, 338, 85, 46);
		Calculator.add(but9);
		
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+"0");
			}
		});
		but0.setBounds(385, 338, 85, 46);
		Calculator.add(but0);
		
		JButton but15 = new JButton("<--");
		but15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=text.getText().length();
				int number = text.getText().length()-1;
				String store;
				if(length>0) {
					StringBuilder back = new StringBuilder(text.getText());
							back.deleteCharAt(number);
					store=back.toString();
					text.setText(store);
				}
			}
		});
		but15.setBounds(105, 155, 85, 55);
		Calculator.add(but15);
		
		JButton but16 = new JButton("=");
		
		but16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(text.getText());
				if(operation == "+")
				{
					result=first+second;
					answer= String.format("%2f", result);
					text.setText(answer);
					
				}
				else if( operation == "-")
				{
					result=first-second;
					answer= String.format("%2f", result);
					text.setText(answer);
				}
				else if (operation == "X") {
					result=first*second;
					answer= String.format("%2f", result);
					text.setText(answer);
				}
				else if (operation =="/")
				{
					result=first/second;
					answer= String.format("%2f", result);
					text.setText(answer);
				}
				
				
			}
		});
		
		but16.setBounds(286, 396, 184, 62);
		Calculator.add(but16);
		
		JRadioButton offbut = new JRadioButton("OFF");
		
		text.setEnabled(false);
		but0.setEnabled(false);
		but1.setEnabled(false);
		but2.setEnabled(false);
		but3.setEnabled(false);
		but4.setEnabled(false);
		but5.setEnabled(false);
		but6.setEnabled(false);
		but7.setEnabled(false);
		but8.setEnabled(false);
		but9.setEnabled(false);
		but10.setEnabled(false);
		but11.setEnabled(false);
		but12.setEnabled(false);
		but13.setEnabled(false);
		but14.setEnabled(false);
		but15.setEnabled(false);
		but16.setEnabled(false);
		buttonGroup_1.add(offbut);
		offbut.setBounds(6, 187, 98, 23);
		Calculator.add(offbut);
		
		JRadioButton onbut = new JRadioButton("ON");
			//offbut.setEnabled(false);
			text.setEnabled(true);
			but0.setEnabled(true);
			but1.setEnabled(true);
			but2.setEnabled(true);
			but3.setEnabled(true);
			but4.setEnabled(true);
			but5.setEnabled(true);
			but6.setEnabled(true);
			but7.setEnabled(true);
			but8.setEnabled(true);
			but9.setEnabled(true);
			but10.setEnabled(true);
			but11.setEnabled(true);
			but12.setEnabled(true);
			but13.setEnabled(true);
			but14.setEnabled(true);
			but15.setEnabled(true);
			but16.setEnabled(true);
		buttonGroup_1.add(onbut);
		onbut.setBounds(6, 156, 98, 23);
		Calculator.add(onbut);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/anhtuan1312/Downloads/1de.jpg"));
		lblNewLabel_1.setBounds(0, 136, 494, 436);
		Calculator.add(lblNewLabel_1);
	}
	
}

