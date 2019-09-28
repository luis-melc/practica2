/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

/**
 *
 * @author luis
 */
public class food {
    private String name;
    private String origin;
    private String ingredients;
    
    //Constructor
    public food(){
        name = "";
        origin = "";
        ingredients = "";
    }
    
    //Seters
    public void setName(String _name){
        name = _name;
    }
    
    public void setOrigin(String _origin){
        origin = _origin;
    }
    
    public void setIngredients(String _ingredient){
        ingredients = _ingredient;
    }
    
    //Geters
    public String getName(){
        return name;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public String getIngrdient(){
        return ingredients;
    }
    
    
    //Metodos
    public void showPlatillo(){
        System.out.println("*********Platillo*********");
        System.out.println("Nombre: " + this.name);
        System.out.println("Origen: " + this.origin);
        System.out.println("Ingredientes: " + this.ingredients);
    }
}
