package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class BrickBreakerIII 
{
	public int m[][];//2D array of bricks
    public int brkWidth;
    public int brkHeight;
 
    public BrickBreakerIII(int r, int c) 
    {
       m = new int[r][c];

        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                m[i][j] = 1;
            }
        }
        
        brkWidth = 540 / c;
        brkHeight = 150 / r;
    }

   
    public void draw(Graphics2D graphics2d, Color colorName) 
    {
    	
    
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) 
            {
                if (m[i][j] > 0) {
                	 
                    graphics2d.setColor(colorName);
                    graphics2d.fillRect(j * brkWidth + 80, i * brkHeight + 50, brkWidth, brkHeight);

                    graphics2d.setStroke(new BasicStroke(4));
                    graphics2d.setColor(Color.GREEN);
                    graphics2d.drawRect(j * brkWidth + 80, i * brkHeight + 50, brkWidth, brkHeight);
                }
            }
        }
    }
    
    public void setBrickValue(int value, int r, int c) {
        m[r][c] = value;
    }
}
