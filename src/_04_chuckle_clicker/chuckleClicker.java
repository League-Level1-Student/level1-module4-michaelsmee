package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
	
		new chuckleClicker().makeButtons();
			
		
		
		
	}
	void makeButtons(){
		
				frame.setVisible(true);
		
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		button2.setText("poo");
		button.setText("pee");
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(button==e.getSource()) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		
		if(button2==e.getSource()) {
			JOptionPane.showMessageDialog(null, "tyler pooped");
		}
	}
	
}
