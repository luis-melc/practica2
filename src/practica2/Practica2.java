/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.Scanner;
import java.util.ArrayList;
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

        // window interfaz = new window();
        // interfaz.show();
        Scanner leer = new Scanner(System.in);
        ArrayList<food> platillos = new ArrayList<food>();
        Integer newPlatillo = 1;
        Integer newIngredient = 1;
        String name = "";
        String origin = "";
        String ingredient = "";
        do{
            food platillo = new food();
            System.out.print("Ingresa el Nombre del Platillo: ");
            name = leer.nextLine();
            System.out.print("Ingresa el Origen del Platillo: ");
            origin = leer.nextLine();
            platillo.setName(name);
            platillo.setOrigin(origin);
            do {
                System.out.print("Ingresa el Ingrediente: ");
                ingredient = leer.nextLine();
                platillo.setIngredients(ingredient);
                System.out.print("¿Desea agregar otro ingrediente? (1=Sí 0=No)");
                newIngredient = leer.nextInt();
                leer.nextLine();
            } while (newIngredient == 1);
            System.out.print("¿Desea agregar otro platillo? (1=Sí 0=No)");
            newPlatillo = leer.nextInt();
            leer.nextLine();
            platillo.deleteIngredient(1);
            platillos.add(platillo);
            System.out.println();
            System.out.println();
        }while(newPlatillo == 1);
        System.out.println();
        System.out.println("*********Platillo*********");
        for (int i = 0; i < platillos.size(); i++){
            if(i != 0){
                System.out.println("**************************");
            }
            food platillo = new food();
            platillo = platillos.get(i);
            platillo.showPlatillo();
            
        }
    }
    
}
