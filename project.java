package aaronKalebProject;
//imports for the gui
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class project implements ActionListener {

	//GUI and variables 
	JFrame frame;
	JTextField textfield;
	JButton add, subtract, multiply, divide, decimal, equals, delete, clear;
	JButton one,two,three,four,five,six,seven,eight,nine,zero;
	JPanel panel;
	
	double num1=0,num2=0,result=0;
	char operator;
	
	public project() {
		//window layout
		frame = new JFrame("Calculator App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);

		//calc 'window'/text field for calculations
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setEditable(false);

		//buttons
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		
		add = new JButton("+");
		
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		
		subtract = new JButton("-");
		
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		
		multiply = new JButton("*");
		
		decimal = new JButton(".");
		
		zero = new JButton("0");
		
		equals = new JButton("=");
		divide = new JButton("/");
		delete = new JButton("Delete");
		clear = new JButton("Clear");

		//sets button placements
		one.setBounds(50,120,70,50);
		two.setBounds(125,120,70,50);
		three.setBounds(200,120,70,50);
		add.setBounds(275,120,75,50);
		
		four.setBounds(50,190,70,50);
		five.setBounds(125,190,70,50);
		six.setBounds(200,190,70,50);
		subtract.setBounds(275,190,75,50);
		
		seven.setBounds(50,260,70,50);
		eight.setBounds(125,260,70,50);
		nine.setBounds(200,260,70,50);
		multiply.setBounds(275,260,75,50);
		
		decimal.setBounds(50,330,70,50);
		zero.setBounds(125,330,70,50);
		equals.setBounds(200,330,70,50);
		divide.setBounds(275,330,75,50);
		
		delete.setBounds(50,430,145,50);
		clear.setBounds(205,430,145,50);

		//adds buttons to the window
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(add);
		
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(subtract);
		
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(multiply);
		
		frame.add(decimal);
		frame.add(zero);
		frame.add(equals);
		frame.add(divide);
		
		
		frame.add(delete);
		frame.add(clear);
		frame.add(textfield);
		frame.setVisible(true);
	}
	//instantiates the project so it can run
	public static void main(String[] args) {
		
		project proj = new project();
		

	}
	@Override
	// method to execute when buttons are pressed
		public void actionPerformed(ActionEvent e) {
		if (e.getSource()==one) {
			
		} else if (e.getSource()==two) {
			
		} else if (e.getSource()==multiply) {
			
		} else if (e.getSource()==divide) {
			
		} else if (e.getSource()==decimal) {
			
		} else if (e.getSource()==equals) {
			
		} else if (e.getSource()==delete) {
			
		} else if (e.getSource()==clear) {
			
		}
	}

}
