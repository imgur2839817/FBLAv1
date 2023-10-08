package main.main; 
import javax.swing.*;
import main.entity.Player;
import java.awt.*;
import java.awt.image.BufferedImage;
import tile.TileManager;
import tile.Tile;
public class GamePanel extends JPanel implements Runnable {
    
    // Screen Settings
    public final int originalTileSize = 16; // 16 x 16 tile
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; //40x40 tile
    public final int maxScreenCol = 16; 
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;

    //WORLD SETTINGS
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    public final int WorldWidth = tileSize * maxWorldCol;
    public final int WorldHeight = tileSize * maxWorldRow;
    // FPS
    int FPS = 60;
    
    TileManager tileM = new TileManager(this);
    
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this, keyH);

 
     // Full screen mode
     private int fullScreenWidth = screenWidth;
     private int fullScreenHeight = screenHeight;
     private BufferedImage tempScreen;
     private Graphics2D graphics2D;
    

     
     


     //Setting the default position for our player
     
    public GamePanel() {
        //Setting game dimensions

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }
    
   
    public void startGameThread() { 

        gameThread = new Thread(this); 
        gameThread.start();


    }
    public void run() {

        double drawInterval = 1000000000/FPS; 
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;  

        while(gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if(delta >= 1) {
            update();
            repaint();
            delta--; 

            }
            
        }

       
    }
        
    
    //Setting up player speed, and player positions when key pressed
public void update() {

  
   player.update();

}


public void paintComponent(Graphics g) {

    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D)g;

   tileM.draw(g2);
    
   player.draw(g2); 
   

    g2.dispose(); 

}

}
