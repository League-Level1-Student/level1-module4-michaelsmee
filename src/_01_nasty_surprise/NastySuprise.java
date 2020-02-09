package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JButton button = new JButton();
	JButton tyler = new JButton();
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		panel.setVisible(true);
	
		button.setVisible(true);
		button.setText("treat");
	
		tyler.setVisible(true);
		tyler.setText("trick");
		frame.add(panel);
		panel.add(tyler);
		panel.add(button);
		button.addActionListener(this);
		tyler.addActionListener(this);
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==button) {
			showPictureFromTheInternet("https://www.google.com/search?q=mike+pence&tbm=isch&ved=2ahUKEwiWv8XipcXnAhWHlJ4KHZ4ZCWoQ2-cCegQIABAA&oq=mike+pence&gs_l=img.3..0j0i131j0l8.7084.8738..9121...0.0..1.561.3035.0j2j2j1j3j1......0....1..gws-wiz-img.......0i67.gAsIvqqCYWE&ei=qmlAXpbCDIep-gSes6TQBg&bih=870&biw=1060#imgrc=XSR-mC9gsuu_NM");
		}	
	
	if(e.getSource()==tyler) {
		showPictureFromTheInternet("https://www.google.com/search?q=tyler+wiltz&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj8yrCGpMXnAhVLOq0KHVh3Be8Q_AUoA3oECAsQBQ&biw=1060&bih=870&dpr=2#imgrc=7dQAEoxyisjqfM");
	}
	
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
