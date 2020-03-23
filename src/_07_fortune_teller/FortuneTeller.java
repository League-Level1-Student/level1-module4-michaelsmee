package _07_fortune_teller;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 400;
    int frameHeight = 400;

    FortuneTeller() throws Exception {
   	 // 1. Choose an image for your fortune teller and put it in your default package
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("kyt_wizard_400.jpg"));
   	 // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
     // 3. Complete the begin() method in the FortuneTellerRunner class
 	 // 4. add a mouse listener to the frame
   	 frame.addMouseListener(this);
    }



    @SuppressWarnings("deprecation")
	@Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
   	 if(e.getSource()==frame)
   		 System.out.println("x is " + mouseX + "y is " + mouseY);
   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 360;
   	 int secretLocationY = 80;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 // 8. Get the user to enter a question for the fortune teller
   		 	String q = JOptionPane.showInputDialog("Any Questions?");
   		 // 9. Find a spooky sound and put it in your default package (freesound.org)
   		// Play a sound
   		 Clip clip;    		 
   		 try {
   		 // 9. You can use the creepy sound we have put in the fortune teller package or
//   		     put your own spooky sound (.wav) in the package  (freesound.org)
   		     URL url = getClass().getResource("creepy-noise.wav");
   		     AudioInputStream audioInputStream =  AudioSystem.getAudioInputStream(url);		
   		     clip = AudioSystem.getClip(); 
   		     clip.open(audioInputStream);
   		     clip.start();
   		 } catch (Exception e1) {
   		     // TODO Auto-generated catch block
   		     System.out.println("cannot get file");
   		 }
   		 // 11. Use the pause() method below to wait until your music has finished
   		 pause(5);
   		 // 12. Insert your completed Magic 8 ball code here
   		 Random rand = new Random();
   		 rand.nextInt(8);
   		 System.out.println(rand);
   		 String p = JOptionPane.showInputDialog("what number did the future see?");
   		 
   		 if(p=="0"){
   			 System.out.println("um......ok");
   		 }
   		 if(p=="1") {
   			 System.out.println("no u");
   		 }
   		 if(p=="2") {
   			 System.out.println("nobody cares");
   		 }
   		 if(p=="3") {
   			 System.out.println("u will be roblox man");
   		 }
   		 if(p=="4") {
   			 System.out.println("who even writes these");
   		 }
   		 if(p=="5") {
   			 System.out.println("u will be a human");
   		 }
   		 if(p=="6") {
   			 System.out.println("u may be a human");
   		 }
   		 if(p=="7") {
   			 System.out.println("subscribe to tyler wiltz, or else....................... u be no human");
   		 }
   		 else {
   			 System.out.println("haha ur so funny, I almost laughed, wait, subscribe to tylerwiltz");
   		 }
   	 
   	 
   	 }

    }

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/
    
    BufferedImage fortuneTellerImage;



    @Override
    public void run() {
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}

// Copyright The League, 2016




