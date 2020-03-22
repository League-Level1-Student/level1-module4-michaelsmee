package _05_typing_tutor;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		new TypingTutor().Tyler();
	}
	
char currentLetter;
void Tyler() {


frame.addKeyListener(this);
currentLetter = generateRandomLetter();


frame.add(label);
frame.setVisible(true);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
label.setText(currentLetter+"");

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
	char x=e.getKeyChar();

	System.out.println(e.getKeyChar());
	System.out.println(currentLetter);
	if(x==currentLetter) {
	System.out.println("correct");	
	label.setBackground(Color.green);
	}
	else {
		System.out.println("u dumbo");
	label.setBackground(Color.red);
	}
	currentLetter = generateRandomLetter();
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setText(currentLetter+"");
}





@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

	
	}
}








