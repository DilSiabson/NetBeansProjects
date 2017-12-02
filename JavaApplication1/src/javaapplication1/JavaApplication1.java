/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Prime_Optimus2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    static class Rectangle{
        Rectangle(double haut){
            hauteur=haut;
            largeur=2*hauteur;
        }
        double surface(){
        return hauteur*largeur;
        }
        public double getHauteur(){
            return hauteur;
        }
        public double getLargeur(){
            return largeur;
        }
        public void setHauteur(double h){
            hauteur=h;
        }
        public void setLargeur(double l){
            largeur=l;
        }
        private double hauteur;private double largeur;
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2);
        r1.surface();
       
        
        double h=r1.getHauteur();
        double l=r1.getLargeur();
        System.out.print(r1.surface()+"   "+h+"   "+l);
    }
    
}
