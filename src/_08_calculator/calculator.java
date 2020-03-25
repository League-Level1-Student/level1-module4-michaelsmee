package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class calculator implements MouseListener {
	String x=JOptionPane.showInputDialog("First Number?");
	String y=JOptionPane.showInputDialog("Second Number?");
int i=Integer.parseInt(x);
int m=Integer.parseInt(y);
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
String a;
String o;
String p;
String z;

public static void main(String[] args) {
	
}	

		public void run() {
	frame.setVisible(true);
	frame.add(panel);
	
	
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
button.setText("add");
button1.setText("subtract");
button2.setText("multiply");
button3.setText("divide");
frame.addMouseListener(this);
frame.pack();
		}	

	void add() {
		int a=i+m;
		System.out.println(a);
		
	}
	
	void subtract() {
		int o=i-m;
		System.out.println(o);
	}
	
	void multiply() {
		int p=i*m;
		System.out.println(p);
	}
	
	void divide() {
		int z=i/m;
		System.out.println(z);
	}

	 public void mousePressed(MouseEvent e) {
	 
	 }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			add();
			button4.setText(a);
		}
		if(e.getSource()==button1) {
			subtract();
			button4.setText(o);
		}
		if(e.getSource()==button2) {
			multiply();
			button4.setText(p);
		}
		if(e.getSource()==button3) {
			multiply();
			button4.setText(z);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
