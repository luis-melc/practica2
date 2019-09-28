/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author luis
 */
public class food {
    private String name;
    private String origin;
    //private String ingredients;
    private ArrayList<String> ingredients = new ArrayList<String>();
    
    //Constructor
    public food(){
        name = "";
        origin = "";
        ingredients.clear();
    }
    
    //Seters
    public void setName(String _name){
        name = _name;
    }
    
    public void setOrigin(String _origin){
        origin = _origin;
    }
    
    public void setIngredients(String _ingredient){
        ingredients.add(_ingredient);
    }
    
    //Geters
    public String getName(){
        return name;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    
    public void deleteIngredient(Integer _index){
        System.out.print(_index);
        ingredients.remove(_index);
    }
    
    
    //Metodos
    public void showPlatillo(){
        System.out.println("Nombre: " + this.name);
        System.out.println("Origen: " + this.origin);
        System.out.println("Ingredientes: ");
        // for (int i = 0; i < ingredients.size(); i++){
        //     System.out.println((i+1) + ")  " + ingredients.get(i));
        // }
        Iterator<String> it = ingredients.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
