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
public class node <T> {
    T data;
    node next;
    /**
     * Constructor 
     * @param data 
     */
    public node (T data) {
        this.data = data;
        this.next = null;
    }
    
     public node () {
        this.data = data; //Inicializamos en que data es igual a data.
        this.next = null;}
    
    public T getdata() {
        return this.data;
    }
    public node getnext() {
        return this.next;
    }
    public void setdata(T data) {
        this.data = data;
    }
    public void setnext(node next) {
        this.next = next;
    } 
}
