package game;

import java.awt.EventQueue;//action starts during click
import javax.swing.JFrame;// frame
import javax.swing.JProgressBar; //loading during start
import javax.swing.SwingConstants;

import java.awt.Font;//font
import java.awt.Toolkit;
import javax.swing.JLabel;//writings
import javax.swing.ImageIcon; //this package is to use image
import java.awt.Color;//for coloring


public class Driver 
{
	private JFrame fr;
	JProgressBar progress;

	//java app will start from this main method
	public static void main(String[] args) 
	{
		Driver page = new Driver();//starting main window 
		
		//using multithreading
		//try catch for exception handling
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {	
					page.fr.setVisible(true);
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
		//method
		page.iterate();
		BrickBreakerI b = new BrickBreakerI(); //creating obj of BB class
		b.bfr.setVisible(true);
		page.fr.setVisible(false);
		//the end
	}

	//creating application
	public Driver() 
	{
		Begining();
		
	}

	//initializing contents of the frame
	private void Begining() 
	{
		fr = new JFrame("START"); 
		fr.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main.png")); //setting image
		fr.setBounds(100, 100, 808, 485); // frame size
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().setLayout(null);
		
		//design of progress bar
		progress = new JProgressBar(0,2000);
		progress.setForeground(Color.BLUE);
		progress.setFont(new Font("Serif", Font.PLAIN, 14));
		progress.setBounds(27, 401, 729, 17);
		progress.setValue(0);
		progress.setStringPainted(true);
		fr.getContentPane().add(progress);
		fr.setSize( 809, 480);
		fr.getContentPane().add(progress);
		
		
		//work on text
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setForeground(Color.GRAY);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("src/brick-breaker.png"));
		label.setBounds(0, 0, 793, 446);
		fr.getContentPane().add(label); 
	}
	
	//runing progress bar here
	public void iterate() 
	{
		int i=0;
		while(i<=2000) 
		{
			progress.setValue(i);
			i=i+40;
			try 
			{
				Thread.sleep(100);}catch(Exception e)//100 milisec sleep time set
			{  
				
			}
		}
	}
}
