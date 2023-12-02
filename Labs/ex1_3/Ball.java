/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author harri
 */   
public class Ball implements Runnable{
private static int World_W,World_H;
private int x,y;
private int dx,dy;
private Color colour;
private int size = 20;
private Random rand;
private boolean stopRequested;
private int bounced_number;
public Ball(){
int x= World_W/2;
int y= World_H/2;
dx = 1;
dy = 2;
rand = new Random();
colour= new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
size = 20;
bounced_number = 0;
}
private void moveBall(){
x += dx;
y += dy;
if(y == 500 || y == 0){
dy *= -1;
bounced_number +=1;
}
if(x == 500 || x == 0){
dx *= -1;
bounced_number +=1;
}
if(bounced_number ==3){
colour = new Color(0,0,0);
}
}
@Override
 public void run(){
 stopRequested = false;
 while(!stopRequested){
 moveBall();
 try{
 Thread.sleep(20);
 }catch(InterruptedException e){
 }
 }
 }
 public void drawBall(Graphics g){
 g.setColor(colour);
 g.fillOval(x, y, size, size);
 }
}
