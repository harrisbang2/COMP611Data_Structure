/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author harri
 *
    /**
     * @param args the command line arguments
     */
    public class BallGUI extends JPanel implements ActionListener{
     private JButton addbutton,removebutton;
     private List<Ball> balls;
     private DrawPanel drawpanel;
     private Timer timer;
     //ballgui
     public BallGUI(){
        super(new BorderLayout());
        balls = new ArrayList<>();
        addbutton = new JButton("Add Ball");
        removebutton= new JButton("remove ball");
        addbutton.addActionListener(this);
        removebutton.addActionListener(this);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addbutton);
        buttonPanel.add(removebutton);
        add(buttonPanel,BorderLayout.SOUTH);
        
        drawpanel = new DrawPanel();
        super.add(drawpanel,BorderLayout.CENTER);
        timer = new Timer(25,this);
        timer.start();
        }    
     @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       if(source == addbutton){
       System.out.println("Add a ball to the list");
       Ball ball = new Ball();
       Thread thread = new Thread(ball);
       thread.start();
       balls.add(ball);
       }
       if(source == removebutton){
        System.out.println("removed a ball from the list");
        int i = 0;
        balls.remove(i);
        i++;
       }
       if(source == timer){
           drawpanel.repaint();
       }
    }
    private class DrawPanel extends JPanel{
    public DrawPanel(){
    super.setPreferredSize(new Dimension(500,500));
    super.setBackground(Color.white);
    }
    
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    for (Ball ball:balls){
    ball.drawBall(g);
    }
    }
    }
     //main starts//
     public static void main(String args[]) {
       JFrame frame = new JFrame("Bounce the ball");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(new BallGUI());
       frame.pack();
       frame.setVisible(true);
    }
    }
