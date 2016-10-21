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
public class nodeclasscircular <T> {
  //Atributos
    public nodeclasscircular next;
     T data;
    //Metodos
    //constructor
    nodeclasscircular(T data){
        this.data = data;
        this.data = null;
    }
    
    public nodeclasscircular(){
        this.data = data;
        this.next = null;
    }
    public T getdata(){
        return this.data;
    }
    public void setdata(T d){
        this.data = d;
    }
}

