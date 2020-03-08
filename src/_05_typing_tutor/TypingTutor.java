package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();

	public static void main(String[] args) {
		new TypingTutor().Tyler();
	}
	
char currentLetter;
void Tyler() {
JFrame frame = new JFrame();
frame.addKeyListener(this);
currentLetter = generateRandomLetter();
JPanel panel = new JPanel();
panel.add(label);
frame.add(panel);
frame.setVisible(true);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);


}





char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');

    
}





@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}





@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

	
	System.out.println(e.getKeyChar());
}





@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter=' ';
	label.setText(currentLetter+"");
	
	}
}








