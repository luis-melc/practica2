/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int noPlatillos = 1;
        food platillos[] = new food[noPlatillos];
        String name = "";
        String origin = "";
        String ingredient = "";
        
        for(int i = 0; i < noPlatillos; i++){
            food platillo = new food();
            platillos[i] = platillo;
        }
        
        for(int i = 0; i < platillos.length; i++){
            System.out.print("Ingresa el Nombre del Platillo: ");
            name = leer.nextLine();
            System.out.print("Ingresa el Origen del Platillo: ");
            origin = leer.nextLine();
            System.out.print("Ingresa el Ingrediente: ");
            ingredient = leer.nextLine();
            platillos[i].setName(name);
            platillos[i].setOrigin(origin);
            platillos[i].setIngredients(ingredient);
            System.out.print("Ingresa el Ingrediente: ");
            ingredient = leer.nextLine();
            platillos[i].setIngredients(ingredient);

        }
        
        for(int i = 0; i < platillos.length; i++){
            platillos[i].showPlatillo();
        }
    }
    
}
