import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//Weiter bei Zeile 150!!!!!!!!!!!!!!!!!!!!! Switch Case

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 04.11.2010
  * @author Erik Barz
  */

public class monopoly extends JFrame {
  //Eigene Variablen
  boolean gestartet=false;


  // Anfang Attribute
  int anzSpieler=0;
  private TextField tfSpieler = new TextField();
  private Label lbHead = new Label();
  private Label lbSpieler = new Label();
  private Button buSpieler = new Button();
  private Label lbSpielerF = new Label();
  private TextField tfSpielername = new TextField();
  private Button buSpielername = new Button();
  // Ende Attribute

  //Anfang Felder
  feld los=new feld(1, "Los", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  feld badstr=new feld(2, "Badstrasse", 60, 2, 10, 30, 90, 160, 250, 30, 50, 0);
  feld template=new feld(3, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  //Ende Felder


  //Konstruktor (Spielfelder, Spieler, Regeln, Ereigniskarten, Frei parken, Gefängnis)
  
  public monopoly(String title) {
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1024;
    int frameHeight = 700;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Container cp = getContentPane();
    cp.setLayout(null);
    

    
    
    // Anfang Komponenten
    tfSpieler.setBounds(312, 48, 25, 19);
    tfSpieler.setText("");
    tfSpieler.setFont(new Font("Calibri", Font.PLAIN, 15));
    cp.add(tfSpieler);
    lbHead.setBounds(488, 8, 111, 33);
    lbHead.setText("Monopoly");
    lbHead.setFont(new Font("Calibri", Font.PLAIN, 23));
    cp.add(lbHead);
    lbSpieler.setBounds(8, 48, 289, 19);
    lbSpieler.setText("Mit wie vielen Spielern möchten Sie spielen?");
    lbSpieler.setFont(new Font("Calibri", Font.PLAIN, 15));
    cp.add(lbSpieler);
    buSpieler.setBounds(352, 48, 43, 19);
    buSpieler.setLabel("OK");
    buSpieler.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        buSpieler_ActionPerformed(evt);
      }
    });
    buSpieler.setFont(new Font("Calibri", Font.PLAIN, 15));
    cp.add(buSpieler);
    lbSpielerF.setBounds(408, 48, 219, 19);
    lbSpielerF.setText("Bitte überprüfen Sie ihre Eingabe!");
    lbSpielerF.setFont(new Font("Calibri", Font.PLAIN, 15));
    cp.add(lbSpielerF);
    tfSpielername.setBounds(32, 72, 305, 27);
    tfSpielername.setText("Bitte hier den Namen von Spieler x eingeben!");
    tfSpielername.setFont(new Font("Calibri", Font.PLAIN, 15));
    cp.add(tfSpielername);
    buSpielername.setBounds(352, 80, 43, 19);
    buSpielername.setLabel("OK");
    buSpielername.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        buSpielername_ActionPerformed(evt);
      }
    });
    cp.add(buSpielername);
    // Ende Komponenten

    setResizable(false);
    setVisible(true);
    
    //Sichtbarkeitseinstellungen
    lbSpielerF.setVisible(false);
  }

  // Anfang Methoden
  public void buSpieler_ActionPerformed(ActionEvent evt)
  {
         //Anzahl der Spieler festlegen
         try
         {
            if(Integer.parseInt(tfSpieler.getText())<=8 && Integer.parseInt(tfSpieler.getText())>0)
            {
               anzSpieler=Integer.parseInt(tfSpieler.getText());
               lbSpielerF.setVisible(false);
               gestartet=true;
            }
            else
            {
               System.out.println(tfSpieler.getText());
               anzSpieler=0;
               lbSpielerF.setVisible(true);
               tfSpieler.setText("");
               gestartet=false;
            }

         }
         catch(NumberFormatException err)
         {
            System.out.println(tfSpieler.getText());
            anzSpieler=0;
            lbSpielerF.setVisible(true);
            tfSpieler.setText("");
            gestartet=false;
         }
         
         //Spieler anlegen
         if (gestartet)
         {
           //Sichtbarkeiten
           lbSpielerF.setVisible(false);
           tfSpieler.setVisible(false);
           lbSpieler.setVisible(false);
           buSpieler.setVisible(false);
           buSpielername.setVisible(true);
           tfSpielername.setVisible(true);

           for(int i=1; i<anzSpieler+1; i++)
           {
              tfSpielername.setText("Bitte hier den Namen von Spieler" + i + "eingeben!");
              //hier Switch Case mit Spielernr als Name des Objektes
              spieler Spieler1=new spieler(i, tfSpielername.getText());
              System.out.println("");
           }
         }
  }

  public void button1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  }

  public void buSpielername_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  }

  // Ende Methoden

  public static void main(String[] args)
  {
    new monopoly("monopoly");
  }
  

}
