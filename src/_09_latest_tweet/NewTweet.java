package _09_latest_tweet;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.*;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class NewTweet implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel =new JPanel();
	JButton button = new JButton();
	JTextField ui = new JTextField(10);
	JLabel label = new JLabel();
	public void run() {
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(ui);
	
	panel.add(button);
	frame.setSize(400, 100);
	frame.pack();
	button.setText("Search Tweets");
	button.addMouseListener(this);
	panel.add(label);
	frame.pack();
	
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    twitter.setOAuthAccessToken(accessToken);

Query query = new Query(searchingFor);
    try {
        QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	String search=ui.getText();
	System.out.println(getLatestTweet(search));
	frame.pack();
	frame.repaint();
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		
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