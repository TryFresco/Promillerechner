/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226a.police;
import ch.bbbaden.m226a.police.AlkoholischesGetraenk;

/**
 *
 * @author rwuer
 */
public class Person {
    public static int Maennlich = 0;
    public static int Weiblich = 1;
    private static double Abbau_Wartezeit_Stunden = 1.0;
    private static double Abbau_Pro_Stunde = 0.1;
    private static double Anteil_Wasser_Im_Blut = 0.8; 
    private static double Dichte_Blut_Gramm_Pro_CCM = 1.055;
    
    private AlkoholischesGetraenk getränk;
    
    private double koerpermasse;
    private double koerpergroesse_in_cm;
    private int geburtsdatum; 
    private int geschlecht;
    private double alkoholPromille = 0.0; 

    public Person(double koerpermasse, double koerpergroesse_in_cm, int geburtsdatum, int geschlecht) {
        this.koerpermasse = koerpermasse;
        this.koerpergroesse_in_cm = koerpergroesse_in_cm;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
    }
    
    
    
    
    private double getAlterInJahren () {
        return 2020 - geburtsdatum;
    }
    
    public void trinke (AlkoholischesGetraenk AlkoholischesGetraenk ) {
        this.getränk = getränk;
    }
    
    public double getAlkoholPromille() {
        double c;
        
        c = (0.8 * AlkoholischesGetraenk.getAlkoholMasseInGramm() / (1.055 * getGKW())); 
    }
    
    private double getGKW() {
        
        double GKW;
        
        if(geschlecht == 1) 
        {
            GKW = 2.447 - 0.09516 * (2020 - geburtsdatum) + 0.1074 * koerpergroesse_in_cm + 0.3362 * koerpermasse;
        }
        
        else
        {
            GKW = 0.203 - 0.07 * (2020 - geburtsdatum) + 0.1069 * koerpergroesse_in_cm + 0.2466 * koerpermasse;
        }
        
        return GKW;
    }

}
