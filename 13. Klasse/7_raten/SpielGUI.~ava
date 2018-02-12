import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.12.2009
  * @author
  */

public class SpielGUI extends JFrame {
  // Anfang Variablen

  // Anfang Attribute
  private JButton buStart = new JButton();
  private JLabel lb1 = new JLabel();
  private JLabel lb2 = new JLabel();
  private JTextField tfEin = new JTextField();
  private JButton buOK = new JButton();
  private JScrollPane jScrollPanetaProtokoll = new JScrollPane();
  private JTextArea taProtokoll = new JTextArea("");
  private JLabel lb3 = new JLabel();
  private JTextField tfAus = new JTextField();
  
  private Ratespiel spiel = new Ratespiel();
  // Ende Attribute

  // Ende Variablen

  public SpielGUI(String title) {
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { System.exit(0); }
    });
    int frameWidth = 500;
    int frameHeight = 350;
    setSize(frameWidth, frameHeight);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    buStart.setBounds(40, 48, 107, 25);
    buStart.setText("Spiel starten");
    cp.add(buStart);
    buStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        buStartActionPerformed(evt);
      }
    });

    lb1.setBounds(48, 96, 152, 24);
    lb1.setText("Errate die Zahl von 1 - 99 !");
    lb1.setFont(new Font("MS Sans Serif", Font.PLAIN, 13));
    cp.add(lb1);
    lb2.setBounds(48, 128, 62, 16);
    lb2.setText("Dein Tipp:");
    lb2.setFont(new Font("MS Sans Serif", Font.PLAIN, 13));
    cp.add(lb2);
    tfEin.setBounds(120, 128, 49, 24);
    tfEin.setText("");
    cp.add(tfEin);
    buOK.setBounds(216, 128, 59, 25);
    buOK.setText("OK");
    cp.add(buOK);
    buOK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        buOKActionPerformed(evt);
      }
    });

    jScrollPanetaProtokoll.setBounds(48, 168, 385, 89);
    taProtokoll.setEditable(false);
    taProtokoll.setText("");
    jScrollPanetaProtokoll.setViewportView(taProtokoll);
    cp.add(jScrollPanetaProtokoll);
    lb3.setBounds(48, 280, 57, 16);
    lb3.setText("Versuche");
    lb3.setFont(new Font("MS Sans Serif", Font.PLAIN, 13));
    cp.add(lb3);
    tfAus.setBounds(120, 280, 49, 24);
    tfAus.setEditable(false);
    tfAus.setText("");
    cp.add(tfAus);
    // Ende Komponenten

    setResizable(false);
    setVisible(true);
    
    //Sichtbarkeitseinstellungen für den Start
    lb2.setVisible(false);
    tfEin.setVisible(false);
    buOK.setVisible(false);
    taProtokoll.setVisible(false);
    lb3.setVisible(false);
    tfAus.setVisible(false);
    
    //Key listener enter und Verbundung mit action event
    tfEin.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        buOKActionPerformed(evt);
      }
    });
  }

  // Anfang Methoden

  // Anfang Ereignisprozeduren
  public void buStartActionPerformed(ActionEvent evt) {
  spiel.starten();
  tfAus.setText(Integer.toString(spiel.getVersuche()));
  buStart.setVisible(false);
  tfEin.setVisible(true);
  buOK.setVisible(true);
  taProtokoll.setVisible(true);
  lb3.setVisible(true);
  tfAus.setVisible(true);
  taProtokoll.setText("");
  }

  public void buOKActionPerformed(ActionEvent evt)
  {
  try
     {
          tfAus.setText(Integer.toString(spiel.getVersuche()));
          int zahl=Integer.parseInt(tfEin.getText());
          if (zahl>=1&&zahl<=99)
            {
               taProtokoll.append(spiel.eingabe(zahl) + ": " + zahl + "\n");
            }
          else
            {
               taProtokoll.append("Ihre Eingabe ist ungültig! Bitte beachten Sie die Spielregeln." + "\n");
            }
          tfEin.setText("");
          if (spiel.getGewonnen())
             {
                 buStart.setVisible(true);
                 buOK.setVisible(false);
                 tfEin.setVisible(false);
             }
     }
  catch (NumberFormatException err)
     {
        taProtokoll.append("Ihre Eingabe ist ungültig! Bitte beachten Sie die Spielregeln." + "\n");
        tfEin.setText("");
     };

  }

  // Ende Ereignisprozeduren

  public static void main(String[] args)
  {
    new SpielGUI("SpielGUI");
  }
  // Ende Methoden
}

