/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalibreria;

/**
 *
 * @author casa
 * @param <T>
 */
public class nodelist <T> {
      T data; 
    nodelist next; //
   
    public nodelist(T data){
        this.data = data; //Inicializamos en que data es igual a data.
        this.next = null; //Inicializamos en que next es igual a null o vacío.
    }
}
