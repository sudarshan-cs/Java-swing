package javaSwingGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class squareRoot 
{

	public static void main(String[] args) 
	{
		
		computeSqrt computeobj = new computeSqrt();
	}

}



class computeSqrt extends JFrame implements ActionListener
{	
	JTextField numinput;
	JLabel msg1,msgoutput;
	JButton button1;
	public static double squareRoot(double number) {
		double temp;

		double csqrt = number / 2;

		do {
			temp = csqrt;
			csqrt = (temp + (number / temp)) / 2;
		} while ((temp - csqrt) != 0);

		return csqrt;
	    }
	
	public computeSqrt() 
	{
		setVisible(true);
		setSize(360,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		msg1 = new JLabel("Enter the number: ");
		msgoutput = new JLabel("");
		button1 = new JButton("Find SquareRoot");
		numinput = new JTextField(25);
		button1.addActionListener(this);
		add(msg1);
		add(numinput);
		add(button1);
		add(msgoutput);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		double number = Integer.parseInt(numinput.getText());
		double numsqrt = squareRoot(number);
		msgoutput.setText("The square root is = "+numsqrt+" !!");
		
	}
}
