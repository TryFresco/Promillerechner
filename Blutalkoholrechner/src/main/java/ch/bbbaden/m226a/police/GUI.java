/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226a.police;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rwuer
 */
public class GUI {

    JFrame frame;

    private Person AskPersonData() {
        String eingabe = JOptionPane.showInputDialog(null,
                "Geben Sie Ihre Körpermasse (kg) an",
                "Körpermasse",
                JOptionPane.PLAIN_MESSAGE);
        double koerpermasse = Double.parseDouble(eingabe);

        String eingabeGroesse = JOptionPane.showInputDialog(null,
                "Geben Sie Ihre Körpergrösse an (cm)",
                "Körpergrösse",
                JOptionPane.PLAIN_MESSAGE);
        double koerpermasse_in_cm = Double.parseDouble(eingabeGroesse);

        String eingabeJahr = JOptionPane.showInputDialog(null,
                "Geben Sie Ihren Jahrgang an",
                "Geburtstag",
                JOptionPane.PLAIN_MESSAGE);
        int jahrgang = Integer.parseInt(eingabeJahr);

        int geschlecht;

        String eingabeGeschlecht = JOptionPane.showInputDialog(null,
                "Geben Sie Ihr Geschlecht an (1 = M, 2 = F)",
                "Geschlecht",
                JOptionPane.PLAIN_MESSAGE);

        geschlecht = Integer.parseInt(eingabeGeschlecht);

        return new Person(koerpermasse, koerpermasse_in_cm, jahrgang, geschlecht);

    }

    private AlkoholischesGetraenk AskAlkoholischeGetraenkeData() {

        String[] options = new String[]{"Bier", "Wein", "Schnaps"};

        int response = JOptionPane.showOptionDialog(null, "Was haben Sie getrunken?", "Alkohol",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        
        double alkoholgehalt = 0;
        
        switch (response) {
            case 0:
                alkoholgehalt = 0.05;
                break;
            case 1:
                alkoholgehalt = 0.1;
                break;
            case 2:
                alkoholgehalt = 0.4;
                break;
            default:
                break;
        }
        
        System.out.println(alkoholgehalt);
        
        String eingabeVolumen = JOptionPane.showInputDialog(null,
                "Wie viel ml haben Sie konsumiert?",
                "Volumen",
                JOptionPane.PLAIN_MESSAGE);
        int volumen = Integer.parseInt(eingabeVolumen);
        
        System.out.println(alkoholgehalt);
        
        String eingabeStunden = JOptionPane.showInputDialog(null,
                "Vor wie vielen Stunden haben Sie getrunken?",
                "Zeit",
                JOptionPane.PLAIN_MESSAGE);
        int stunden = Integer.parseInt(eingabeStunden);
        
        
        
        return new AlkoholischesGetraenk(volumen, alkoholgehalt, stunden);

    }

    public void promilleRechner() {
        
        Person Robin = AskPersonData();
        AlkoholischesGetraenk getränk = AskAlkoholischeGetraenkeData();
        Robin.trinke(getränk);
        Robin.getAlkoholPromille();
        
    }
}