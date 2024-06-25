package game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;//bricks 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;//storing scores in the text file
import java.io.IOException;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BrickBreakerII extends JPanel implements KeyListener, ActionListener {
    // KeyListener detects arrow key and ActionListener for moving the ball

    private boolean game = false;
    public int point = 0;

    private int numOfBricks = 40;

    private Timer t;
    private int delaytime = 9; // delay time

    private int gamerX = 300;

    private int bPX = 290;
    private int bPY = 350;
    private int bDX = getRandomNumberForX(); //function jara random number dey
    private int bDY = getRandomNumberForY(); // randomly ball ta move kore

    private BrickBreakerIII mPlay;

    public BrickBreakerII() {
        mPlay = new BrickBreakerIII(4, 10);
        //bb3 pager er shathe connection
        //main theke bb, bb theke bb2 and developer, bb2 theke bb3 connection

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        t = new Timer(delaytime, this); //move hote shomoy ney 9 milsec
        t.start();

    }

    @Override
    public void paint(Graphics graphics) {
        {
            // background
            graphics.setColor(Color.black);
            graphics.fillRect(1, 1, 692, 592);

            // drawing map of bricks
            if (point == 0) {
                mPlay.draw((Graphics2D) graphics, Color.yellow);
            } else if (point == 5) {
                mPlay.draw((Graphics2D) graphics, Color.cyan);

            } else if (point == 10) {
                mPlay.draw((Graphics2D) graphics, Color.MAGENTA);

            } else if (point == 15) {
                mPlay.draw((Graphics2D) graphics, Color.orange);

            } else if (point == 20) {
                mPlay.draw((Graphics2D) graphics, Color.CYAN);

            } else if (point == 25) {
                mPlay.draw((Graphics2D) graphics, Color.pink);

            } else if (point == 30) {
                mPlay.draw((Graphics2D) graphics, Color.gray);

                graphics.fillRect(gamerX, 550, 100, 8);
            } else if (point == 35) {
                mPlay.draw((Graphics2D) graphics, Color.RED);
                graphics.fillRect(gamerX, 550, 100, 8);
            } else if (point == 40) {
                mPlay.draw((Graphics2D) graphics, Color.blue);

            } else if (point >= 45 || point <= 150) {
                mPlay.draw((Graphics2D) graphics, Color.DARK_GRAY);

            } else if (point >= 150) {
                mPlay.draw((Graphics2D) graphics, Color.GREEN);

            }

            // border
            graphics.setColor(Color.yellow);
            graphics.fillRect(0, 0, 3, 592);
            graphics.fillRect(0, 0, 692, 3);
            graphics.fillRect(691, 1, 3, 592);

            // score
            graphics.setColor(Color.pink);
            graphics.setFont(new Font("serif", Font.BOLD, 26));
            graphics.drawString("Score: " + point, 490, 30);

            // paddle
            graphics.setColor(Color.yellow);
            graphics.fillRect(gamerX, 550, 100, 8);

            if (game == false) {
                // game start message
                graphics.setColor(Color.pink);
                graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
                graphics.drawString("PRESS ENTER/LEFT/RIGHT TO START THE GAME!", 40, 300);

                // ball hiding
                graphics.setColor(Color.blue);
                graphics.fillOval(bPX, bPY, 10, 10);
            } else {
                // ball showing
                graphics.setColor(Color.orange);
                graphics.fillOval(bPX, bPY, 10, 10);
            }

            //total count of bricks
            if (numOfBricks <= 0) {
                game = false;
                bDX = 0;
                bDY = 0;

                // hiding the ball after game over
                graphics.setColor(Color.blue);
                graphics.fillOval(bPX, bPY, 10, 10);

                graphics.setColor(Color.ORANGE);
                graphics.setFont(new Font("serif", Font.BOLD, 30));
                graphics.drawString("You Win! Score: " + point, 200, 300);
                int y = point;
                int highscore = 0;
                try {

                    BufferedReader r = new BufferedReader(
                            new FileReader("src/score.txt"));//score txt highscore likhe rakhar jonno
                    String line = r.readLine();
                    while (line != null) {
                        try {
                            y = Integer.parseInt(line.trim());
                            if (y > highscore) {
                                highscore = y;
                            }
                        } catch (NumberFormatException e1) {
                        }
                        line = r.readLine();
                    }
                    r.close();
                } catch (IOException e2) {

                }

                graphics.setColor(Color.RED);
                graphics.setFont(new Font("serif", Font.BOLD, 30));
                graphics.drawString("!! High Score: " + y + "!!", 180, 300);

                try {
                    BufferedWriter re = new BufferedWriter(
                            new FileWriter("src/score.txt"));
                    re.newLine();
                    re.append("" + y);
                    re.close();
                } catch (IOException e3) {
                    // System.out.println(" error");
                }

                graphics.setColor(Color.yellow);
                graphics.setFont(new Font("serif", Font.BOLD, 20));
                graphics.drawString("Press Enter to Restart ", 200, 350);

                // above score hiding
                graphics.setColor(Color.blue);
                graphics.setFont(new Font("serif", Font.BOLD, 26));
                graphics.drawString("Score: " + point, 490, 30);

                // hide remains bricks
                mPlay.draw((Graphics2D) graphics, Color.BLACK);

                // paddle
                graphics.setColor(Color.blue);
                graphics.fillRect(gamerX, 550, 100, 8);

                // game start message
                graphics.setColor(Color.blue);
                graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
                graphics.drawString("Press Enter/Left/Right Arrow to start the game!", 100, 450);
            }

            if (bPY > 570) { // if ball fall in down
                game = false;
                bDX = 0;
                bDY = 0;

                // hiding the ball after game over
                graphics.setColor(Color.black);
                graphics.fillOval(bPX, bPY, 10, 10);

                graphics.setColor(Color.red);
                graphics.setFont(new Font("serif", Font.BOLD, 30));
                graphics.drawString("Game over! your Score: " + point, 200, 350);
                int x = point;
                try {

                    FileWriter f = new FileWriter("src/score.txt", true);
                    f.write(x);
                    f.close();

                } catch (IOException e) {
                    e.getStackTrace();
                }
                int highscore = 0;

                try {

                    BufferedReader r = new BufferedReader(
                            new FileReader("src/score.txt"));
                    String line = r.readLine();
                    while (line != null) {
                        try {
                            x = Integer.parseInt(line.trim());
                            if (x > highscore) {
                                highscore = x;
                            }
                        } catch (NumberFormatException e1) {
                        }
                        line = r.readLine();
                    }
                    r.close();
                } catch (IOException e2) {

                }

                //showing high score
                if (x > highscore) {
                    graphics.setColor(Color.pink);
                    graphics.setFont(new Font("serif", Font.BOLD, 30));
                    graphics.drawString("!!Wow,Your new High score: " + x + " !!! ", 80, 300);
                } //when it will be tie
                else if (point == highscore) {
                    graphics.setColor(Color.pink);
                    graphics.setFont(new Font("serif", Font.BOLD, 30));
                    graphics.drawString("!! Tied! High Score: " + x + "!!", 180, 300);
                } else {
                    graphics.setColor(Color.pink);
                    graphics.setFont(new Font("serif", Font.BOLD, 30));
                    graphics.drawString("!!High Score: " + highscore + "!!", 200, 400);
                }
                try {
                    BufferedWriter re = new BufferedWriter(
                            new FileWriter("src/score.txt"));
                    re.append("" + x);
                    re.close();
                } catch (IOException e3) {
                    System.out.println(" error");
                }

                graphics.setColor(Color.orange);
                graphics.setFont(new Font("serif", Font.BOLD, 25));
                graphics.drawString("Press ENTER to Restart ", 200, 450);

                // above score hiding
                graphics.setColor(Color.blue);
                graphics.setFont(new Font("serif", Font.BOLD, 26));
                graphics.drawString("Score: " + point, 490, 30);

                // hide remains bricks
                mPlay.draw((Graphics2D) graphics, Color.BLACK);

                // paddle
                graphics.setColor(Color.blue);
                graphics.fillRect(gamerX, 550, 100, 8);

                // game start message
                graphics.setColor(Color.BLUE);
                graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
                //graphics.drawString("Press Enter/Left/Right Arrow to start the game!", 100, 350);

            }
            graphics.dispose();

        }
    }

    @Override

    //keyboard actions
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (gamerX >= 600) {
                gamerX = 600;
            } else {
                moveRight();
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            if (gamerX < 10) {
                gamerX = 10;

            } else {
                moveLeft();
            }
        }
        //action for pressing enter
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!game) {
                game = true;
                gamerX = 310;
                bPX = 290;
                bPY = 350;
                bDX = getRandomNumberForX();
                bDY = getRandomNumberForY();
                numOfBricks = 60;

                mPlay = new BrickBreakerIII(4, 10);
                point = 0;

                repaint();
            }
        }
    }

    public void moveRight() {
        game = true;
        gamerX = gamerX + 50;
    }

    public void moveLeft() {
        game = true;
        gamerX = gamerX - 50;
    }

    @Override
    //when ball touches the bricks
    public void actionPerformed(ActionEvent ae) {
        t.start();

        if (game) {
            if (new Rectangle(bPX, bPY, 10, 10).intersects(new Rectangle(gamerX, 550, 100, 8))) {
                bDY = -bDY;
            }

            A:
            for (int i = 0; i < mPlay.m.length; i++) {
                for (int j = 0; j < mPlay.m[0].length; j++) {
                    if (mPlay.m[i][j] > 0) {
                        int brickX = j * mPlay.brkWidth + 80;
                        int brickY = i * mPlay.brkHeight + 50;
                        int brickWidth = mPlay.brkWidth;
                        int brickHeight = mPlay.brkHeight;

                        //brick length,width and position
                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(bPX, bPY, 20, 20);
                        Rectangle brickRect = rect;

                        //ball brick intersection
                        if (ballRect.intersects(brickRect)) {
                            mPlay.setBrickValue(0, i, j);
                            numOfBricks--; //count of brick decrimenting
                            point = point + 5; //adding 5 score for breaking per brick

                            if (bPX + 19 <= brickRect.x || bPX + 1 >= brickRect.x + brickRect.width) {
                                bDX = -bDX;
                            } else {
                                bDY = -bDY;
                            }
                            break A;
                        }
                    }
                }
            }

            bPX = bPX + bDX;
            bPY = bPY + bDY;

            if (bPX < 0) { // for left
                bDX = -bDX;
            }
            if (bPY < 0) { // for top
                bDY = -bDY;
            }
            if (bPX > 670) { // for right
                bDX = -bDX;
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public int getRandomNumberForY() {
        Random random = new Random();
        int max = -1;
        int min = -3;
        int randomNumber = min + random.nextInt(max - min + 1);
        return randomNumber;
    }

    public int getRandomNumberForX() {
        Random random = new Random();
        int max = -1;
        int min = -3;
        int randomNumber = min + random.nextInt(max - min + 1);
        return randomNumber;
    }
}
