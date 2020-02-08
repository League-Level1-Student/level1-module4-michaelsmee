package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySuprise {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		JButton button = new JButton();
		button.setVisible(true);
		button.setText("treat");
		JButton tyler = new JButton();
		tyler.setVisible(true);
		tyler.setText("trick");
		frame.pack();
		frame.add(panel);
		panel.add(tyler);
		panel.add(button);
		
	}
}
