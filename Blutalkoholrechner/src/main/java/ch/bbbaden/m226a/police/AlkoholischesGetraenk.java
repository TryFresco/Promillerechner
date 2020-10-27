ö/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226a.police;

/**
 *
 * @author rwuer
 */
public class AlkoholischesGetraenk {
    private static double Bier_Alkoholgehalt = 0.05;
    private static double Wein_Alkoholgehalt = 0.10;
    private static double Schnaps_Alkoholgehalt = 0.40; 
    public static double Dichte_Alkohol = 0.8;
    private int volumenInMilliLiter;
    private double alkoholgehalt;
    private int getrunkenAm;
    
    
    public AlkoholischesGetraenk(int volumenInMilliLiter, double alkoholgehalt, int getrunkenAm) {
        this.volumenInMilliLiter = volumenInMilliLiter;
        this.alkoholgehalt = alkoholgehalt;
        this.getrunkenAm = getrunkenAm;
    }
    
    public double getStundenSeitEinnahme(java.util.Date jetzt) {
        return getrunkenAm;
    }
    
    public double getAlkoholMasseInGramm() {
        return volumenInMilliLiter * alkoholgehalt * Dichte_Alkohol; 
    }
    
    
}
