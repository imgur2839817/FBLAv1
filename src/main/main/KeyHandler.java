package main.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
             upPressed = true; 
            }
            else if(code == KeyEvent.VK_S) {
                downPressed = true; 
            }
        
         else if(code == KeyEvent.VK_A) {
                leftPressed = true; 
            }
         
         else if(code == KeyEvent.VK_D) {
                rightPressed = true; 
            }
         if(code == KeyEvent.VK_UP) {
             upPressed = true; 
            }
       else if(code == KeyEvent.VK_DOWN) {
                downPressed = true; 
            }
        
        else if(code == KeyEvent.VK_LEFT) {
                leftPressed = true; 
            }
         
         else if(code == KeyEvent.VK_RIGHT) {
                rightPressed = true; 
            }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode(); 
        if(code == KeyEvent.VK_W) {
             upPressed = false; }

        if(code == KeyEvent.VK_S) {
            downPressed = false; }
        
         if(code == KeyEvent.VK_A) {
                leftPressed = false; }
         
         if(code == KeyEvent.VK_D) {
                rightPressed = false; }
                     
            if(code == KeyEvent.VK_UP) {
             upPressed = false; 
            }
        if(code == KeyEvent.VK_DOWN) {
                downPressed = false; 
            }
        
         if(code == KeyEvent.VK_LEFT) {
                leftPressed = false; 
            }
         
         if(code == KeyEvent.VK_RIGHT) {
                rightPressed = false; 
            }

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
        
        
    
    }
    
}
