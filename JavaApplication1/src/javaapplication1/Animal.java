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
public class Animal {
    protected String tete="dit oui";
}
class Hydre extends Animal{
    protected String tete="dit non";
 public String toString(){
     return tete+" "+super.tete;
 }
}
class Mythologie{
public static void main(String[]args){
Hydre h=new Hydre();
System.out.println(h);
}
}