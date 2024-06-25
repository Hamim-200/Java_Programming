package game;


import java.awt.EventQueue;
import javax.swing.JFrame; // to create frame
import javax.swing.JLabel; // for texting related work
import javax.swing.SwingConstants;
import java.awt.Font; // to set text fonts
import java.awt.Color; // to set colour 
import java.awt.Toolkit; 
import javax.swing.JButton; // to create buttons
import javax.swing.ImageIcon; // to use any image
import java.awt.event.ActionListener; // to add any action to the buttons
import java.awt.event.ActionEvent; 

public class BrickBreakerI {
	JFrame bfr;

	//launching the application here
	//multithreading in the progress bar window
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BrickBreakerI display = new BrickBreakerI();
					display.bfr.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}

	//creating the application
	public BrickBreakerI() 
	{
		begin();
	}

	//initializing the contents of the frame
	// this method is designing the 2nd frame
	private void begin() 
	{
		bfr = new JFrame("BRICK BREAKER GAME"); 
		bfr.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main.png"));
		bfr.getContentPane().setForeground(Color.magenta);
		bfr.setBounds(100, 100, 809, 485);
		bfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bfr.getContentPane().setLayout(null);
		
		
		//creating button objects		
		JButton btn = new JButton("STARTING GAME");
		btn.setBackground(new Color(255, 255, 255));
		
		//creating actions for the buttons
		btn.addActionListener(new ActionListener() 
		{
				public void actionPerformed(ActionEvent e) 
				{
				JFrame f = new JFrame("BRICK BREAKER GAME"); // the frame design after pressing the button
		       f.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main.png"));
		        
		        BrickBreakerII gamePlay = new BrickBreakerII();

		       //design of brick breakerII
		       f.setBounds(10, 10, 700, 600);
		        f.setTitle("Brick Breaker");
		        f.setResizable(false);
		       f.setVisible(true);
		       
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.getContentPane().add(gamePlay);
		        bfr.setVisible(false);
			}
		});
		
		btn.setForeground(Color.red);
		btn.setFont(new Font("Arial Black", Font.BOLD, 16));
		btn.setBounds(289, 118, 169, 48);
		bfr.getContentPane().add(btn);
		
		
		JButton exitbtn = new JButton("Exit");
		exitbtn.setBackground(new Color(255, 255, 255));
		exitbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				bfr.setVisible(false);
			}
		});
		
		exitbtn.setForeground(Color.red);
		exitbtn.setFont(new Font("Arial Black", Font.BOLD, 16));
		exitbtn.setBounds(289, 284, 169, 48);
		bfr.getContentPane().add(exitbtn);
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(Color.BLUE);
		lbl.setIcon(new ImageIcon("src/giphy.gif"));//setting gif 
		lbl.setBounds(10, 0, 783, 435);
		bfr.getContentPane().add(lbl);
		
		JLabel lb = new JLabel("");
		lb.setBackground(Color.BLUE);
		lb.setForeground(Color.darkGray);
		lb.setBounds(635, 0, 158, 446);
		bfr.getContentPane().add(lb);
		
	}
}










