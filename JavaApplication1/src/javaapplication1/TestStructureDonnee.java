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
public class TestStructureDonnee {
    static class nombre{
        int n,m;
        int fibo(int n){
            if (n==0){
                return 1;
            }
            else{
                if (n==1){
                return 1;
            }
            else{
                return fibo(n-1)+fibo(n-2);
            }
            }
        }
        int U(int n){
            if (n==0){
                return 1;
            }
            else{
                return 3*U(n-1)-1;
            }
        }
        boolean TB(int n,int m){
            return n==m;
        }
        boolean tb(int n,int m){
        if (n==m){
            return (true);
        }else{
            return(false);
        }
        
        }
      }
   
    public static void main(String[]args){
    nombre f=new nombre();
    System.out.println("en suite numerique on a "+f.U(5));
    System.out.println("en fibonacci on a "+f.fibo(5));
    System.out.println(f.TB(1, 2));
    System.out.println(f.tb(1,2));
    }
}
