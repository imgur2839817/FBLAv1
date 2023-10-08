package main.main;

import javax.swing.JFrame;

import main.main.GamePanel;


public class main {
    public static void main(String[] args)  {
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Finley's Bombastic and Legendary Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); 

        window.setLocationRelativeTo(null);
        window.setVisible(true); 

        gamePanel.startGameThread(); 
        
    

        
    }
}
