/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Image2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    int nl=5 , nc= 6 ; 
    //initialisation du tableau matrice 
        int [][]matrice = {
        {25, 23, 100, 100, 100, 100},
        {44, 45, 50, 100, 100, 100},
        {65, 65, 50, 20, 100, 100},
        {90, 62, 100, 5, 0, 0},
        {60, 87, 100, 0, 100, 100}
        };
        //Evaluation du contrast 
                System.out.print (" Entrez un contrast");
                int c = reader.nextInt();
                
                if ( c > 50 && c <= 75){
                    c = 75 ;
                }
                if ( c > 75){
                c = 100 ; 
                }
                else {
                    c = c/2 ; 
                }
                int [][]affichage = Mystere(c);
                // affichage du tableau 
                for (int i = 0; i<nl; i++){
            System.out.println();
            for (int j = 0; j<nc; j++){
                System.out.print (affichage[i][j]+"\t") ;
        
}             // Affichage du contrast 
            System.out.println("le contrast est " +c);
                }
    }
    
    public static int [][] Mystere(int c) {
        
    
    final int nl=5, nc=6;
    int [][]matrice = {
        {25, 23, 100, 100, 100, 100},
        {44, 45, 50, 100, 100, 100},
        {65, 65, 50, 20, 100, 100},
        {90, 62, 100, 5, 0, 0},
        {60, 87, 100, 0, 100, 100}
        };
            for (int i = 0; i <nl; i++){
                for(int j = 0; j<nc ; j++)
                    matrice[i][j] = c-matrice[i][j];
            }
            return matrice;
}
}
