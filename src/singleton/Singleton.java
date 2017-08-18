/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;


/**
 *
 * @author personal
 */
public class Singleton{
    private static Singleton instance;
    
    private Singleton(){
        
    }

    public static Singleton getInstance()
    {
        if(instance == null) //comprobar si instance existe, y si no, se crea. Si existe, se regresa.
        {
            instance = new Singleton();
        }
        return instance;
    }

    void doOperations() //getHora y getFecha
    {
        System.out.println("Esta es una de las operaciones");
    }
}