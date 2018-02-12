// Das Schneeflockentanzen ist von www.netspace.org/~bperkins/snow.java entnommen

import java.applet.*;
import java.io.*;
import java.awt.*;

public class snow0 extends java.applet.Applet implements Runnable {
  final int Number_Flakes=100;
  final int SNOW=1;
  final int MOUNTAIN=2;
  final int AIR=0;
  int X_Size=150;
  int Y_Size=150;
  Thread artist=null;
  int [][]flakes ;
  int Screen[][];

  public snow0() {
    setForeground(Color.white);
    setBackground(Color.blue);
    Screen=new int[X_Size][Y_Size];
    flakes = new int[Number_Flakes][2];
    setSize(X_Size,Y_Size);
  }
  public void init() {
    int x,y;
    int y_change=0; // zaehlt die Wechsel von bergauf nach bergab und umgekehrt
    super.init();
    for(int i =0;i<X_Size;i++)
      for(int j =0;j<Y_Size;j++)
        Screen[i][j]=AIR;
    y=Y_Size/8*7; // Beginn der Bergkette
    int i=0;
    for ( x = 0; x < X_Size;x++) { // Zufaellige Bergkette erzeugen
      if (x == i) {
          i+=Math.max(5,Math.min((int)(Math.random()*Y_Size/5),15));
          y_change++;
      }
      if (y_change%2 == 0)
        y++;
      else
        y--;
      y=Math.min(y,Y_Size -1);
      y=Math.max(y,0);
      Screen[x][y]=MOUNTAIN;
      for(int y1=y;y1<Y_Size;y1++) // Alle Punkte unterhalb y
        Screen[x][y1]=MOUNTAIN;    // als Berg markieren
    }
     for (i=0; i<Number_Flakes; i++)
     {
         do
         {


          // Schneeflocken erzeugen
          flakes [i] [0] = (int)(Math.random()*X_Size);
          flakes [i] [1] = (int)(Math.random()*Y_Size);
      }   while (Screen[flakes[i][0]] [flakes[i][1]]!=AIR);
         }
  }

  public void draw_flake(int x, int y , Graphics g){
    g.fillRect(x,y,1,1); 
  }

  public void draw_mountain(int x, int y , Graphics g){
    g.setColor(Color.black);
    g.fillRect(x,y,1,1);
    g.setColor(getForeground());
  }

  public void move_flake_left(int x, int y , Graphics g){
    g.fillRect(x-1,y,1,1);
    g.clearRect (x, y, 1, 1);

  }

  public void move_flake_right(int x, int y , Graphics g){
    g.fillRect(x+1,y,1,1);
    g.clearRect (x, y, 1, 1);

  }

  public void move_flake_down(int x, int y , Graphics g){
    g.fillRect(x,y+1, 1,1);
    g.clearRect (x, y, 1, 1);

  }

  public void update(Graphics g) {
     int i;
     for (i=0;i<Number_Flakes; i++)
         {
            if (Screen[flakes[i][0]] [flakes[i][1]]==AIR)
            {
               move_flake_down(flakes[i][0],flakes[i][1],g);
               flakes[i][1] = flakes[i][1]+1;
            }
            else
            {
               flakes[i][1] = 0;
            }
         }


    }


  public void paint(Graphics g) {
    for(int i =0;i<X_Size;i++)
      for(int j =0;j<Y_Size;j++) 
        if (Screen[i][j] == SNOW)
          draw_flake(i,j,g);
        else if (Screen[i][j] == MOUNTAIN)
          draw_mountain(i,j,g);
    for ( int i= 0; i < Number_Flakes; i++)
      draw_flake(flakes[i][0],flakes[i][1], g );
  }

  public void start() {
    if (artist == null){
      artist= new Thread(this);
      artist.start();
    }
  }

  public void stop(){
    artist = null;
  }

  public void run() {
    while(artist != null) {
     try { Thread.sleep(5);} catch(InterruptedException e){}
     repaint();
    }
    artist = null;
  }
}



